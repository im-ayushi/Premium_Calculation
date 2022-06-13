package com.nagarro.assignment.controller;

import java.util.ArrayList;

import com.nagarro.assignment.domain.Car;

import com.nagarro.assignment.view.Input;

import com.nagarro.assignment.service.PremiumCalculationService;
import com.nagarro.assignment.view.Output;

public class Application {
	public static void main(String[] args) {

		// 1.read input
		Input input = new Input();
		ArrayList<Car> inputCarsDetail = input.getInput();

		// 2.Premium calculate
		PremiumCalculationService premiumCalculationService = new PremiumCalculationService();
		ArrayList<Car> calculateCarsDetail = premiumCalculationService.calculatePremium(inputCarsDetail);

		// 3.output
		Output output = new Output();
		output.displayOutput(calculateCarsDetail);
	}
}
