package com.nagarro.assignment.service;

import java.util.ArrayList;

import com.nagarro.assignment.domain.Car;
import com.nagarro.assignment.domain.CarType;
import com.nagarro.assignment.domain.InsuranceType;
import com.nagarro.assignment.util.CommonConstants;

public class PremiumCalculationService {

	public ArrayList<Car> calculatePremium(ArrayList<Car> carList) {

		ArrayList<Car> newCarList = new ArrayList<>();

		double premiumCost = 0;

		for (Car car : carList) {
			if (CarType.HATCHBACK == car.getCarType()) {
				premiumCost = CommonConstants.HATCHBACKCONST * car.getcost();
			}

			else if (CarType.SEDAN == car.getCarType()) {
				premiumCost = CommonConstants.SEDANCONST * car.getcost();
			}
			else {
				premiumCost = CommonConstants.SUVCONST * car.getcost();
			}
			if (InsuranceType.PREMIUM == car.getInsuranceType()) {
				premiumCost = premiumCost + CommonConstants.PREMIUMCONST * premiumCost;
			}
			car.setpremium(premiumCost);
			newCarList.add(car);

		}
		return newCarList;
	}
}
