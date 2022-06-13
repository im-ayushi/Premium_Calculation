package com.nagarro.assignment.domain;

public class Car {

	private String carModel;

	private double cost;

	private double premium;

	private CarType carType;

	private InsuranceType insuranceType;

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getcarModel() {
		return carModel;
	}

	public double getcost() {
		return cost;
	}

	public double getpremium() {
		return premium;
	}

	public void setcarModel(String carModel) {
		this.carModel = carModel;
	}

	public void setcost(double cost) {
		this.cost = cost;
	}

	public void setpremium(double premium) {
		this.premium = premium;
	}
}
