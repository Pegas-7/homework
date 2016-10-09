package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery;

public abstract class Stationery implements Comparable<Stationery>{
	protected double price;

	public Stationery(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int compareTo(Stationery o) {
		return 0;
	}
}
