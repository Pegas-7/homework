package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators;

import java.util.Comparator;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;

public class SortByPrice implements Comparator<Stationery>{
	@Override
	public int compare(Stationery o1, Stationery o2) {
			return (int) (o1.getPrice() - o2.getPrice());
	}
}
