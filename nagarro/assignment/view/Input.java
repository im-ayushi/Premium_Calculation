package com.nagarro.assignment.view;

import java.util.*;

import java.util.ArrayList;

import com.nagarro.assignment.domain.Car;
import com.nagarro.assignment.domain.CarType;
import com.nagarro.assignment.domain.InsuranceType;

public class Input {

	public String getInsuranceType(Scanner sc) {
		boolean isValid = true;
		System.out.println("Enter car insurance type || Basic or Premium || :");
		String insuranceType = "";
		do {
			try {
				insuranceType = sc.next();
				if (InsuranceType.valueOf(insuranceType.toUpperCase()) != null)
					isValid = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Enter valid car insurance type || Basic or Premium || :");

			}

		}while(isValid);
		return insuranceType;
	}

	public String getCarType(Scanner sc) {
		boolean isValid = true;
		System.out.println("Enter car details like Hatchback/sedan/suv");
		String cartype = "";
		do {
			try {
				cartype = sc.nextLine();
				if (CarType.valueOf(cartype.toUpperCase()) != null) {
					isValid = false;
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Enter valid input // Enter car type: Hatchback,sedan,suv");
			}
		}while (isValid);
		return cartype;
	}

	public double getCost(Scanner sc) {
		System.out.println("Enter car Price :");
		boolean isValid = true;
		double cost = 0.0;
		do {
			try {
				cost = sc.nextDouble();
				if ((cost) >= 100000) {
					isValid = false;
				} else {
					System.out.println("Enter valid cost priceS");
					isValid = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Car Price entered is invalid!!\nPlease Enter valid cost price:");
			}
		}while (isValid);
		return cost;
	}

	public ArrayList<Car> getInput() {
		ArrayList<Car> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		char check = 'y';
		while (check == 'y') {

			System.out.println("Enter car Model :");
			String cModel = sc.nextLine();
			String cType = getCarType(sc);
			double cost = getCost(sc);
			String insuranceType = getInsuranceType(sc);

			Car car = new Car();

			car.setcarModel(cModel);
			car.setCarType(CarType.valueOf(cType.toUpperCase()));
			car.setcost(cost);
			car.setInsuranceType(InsuranceType.valueOf(insuranceType.toUpperCase()));
			arr.add(car);
			System.out.println("Do you want to enter new car details : y for yes || n for no");
			check = sc.next().charAt(0);
			sc.nextLine();
		}

		sc.close();
		return arr;
	}
}
