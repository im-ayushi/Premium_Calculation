package com.nagarro.assignment.view;

import java.util.ArrayList;

import com.nagarro.assignment.domain.Car;

public class Output {

	public void displayOutput(ArrayList<Car> carList) {
		System.out.println("Thanks for your valuable time!! Your result is here:\n");
		for (Car i : carList) {
			System.out.println("Car Model:\t" + i.getcarModel());
			System.out.println("Car Price:\t" + i.getcost());
			System.out.println("Total Insurance: \n\n\n" + i.getpremium());
			System.out.println();
		}
	}
}
