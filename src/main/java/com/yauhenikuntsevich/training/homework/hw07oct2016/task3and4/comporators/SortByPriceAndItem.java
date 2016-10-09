package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators;

import java.util.Comparator;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;

public class SortByPriceAndItem implements Comparator<Stationery> {
	@Override
	public int compare(Stationery o1, Stationery o2) {
		if (o1.getPrice() - o2.getPrice() != 0) {
			return (int) (o1.getPrice() - o2.getPrice());
		} else
			return o1.getClass().getName().compareTo(o2.getClass().getName());
	}
}
