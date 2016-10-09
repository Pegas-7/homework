package com.yauhenikuntsevich.training.homework.hw07oct2016.task2;

import java.util.ArrayList;
import java.util.List;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task2.stationery.Stationery;

public class Workplace {
	List<Stationery> stationeries = new ArrayList<>();

	public double priceAllStationeries() {
		double price = 0;
		
		for (int i = 0; i < stationeries.size(); i++) {
			price += stationeries.get(i).getPrice();
		}
		
		return price;
	}
}
