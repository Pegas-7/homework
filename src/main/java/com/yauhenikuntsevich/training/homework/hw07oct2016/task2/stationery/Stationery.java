package com.yauhenikuntsevich.training.homework.hw07oct2016.task2.stationery;

public abstract class Stationery {
	private double price;

	public Stationery(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}
