package com.mywork.SetterConstructorInjection;

public class Laptop {

	private String brand;
	private String model;
	private double price;

	public Laptop() {
		System.out.println("No Arg Called");
	}

	public Laptop(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	void show() {
		System.out.println("Model" + model);
		System.out.println("Brand" + brand);
		System.out.println("Price" + price);
	}

}
