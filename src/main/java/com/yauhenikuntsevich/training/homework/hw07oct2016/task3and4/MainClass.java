package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4;

import java.util.Collections;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByItem;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByPrice;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByPriceAndItem;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;

/**
 * Class specified for testing comparators
 * 
 * @author Evgeni Kuntsevich
 *
 */
public class MainClass {
	public static void main(String[] args) {
		BegginerSet begginerSet1 = new BegginerSet();
		
		Collections.sort(begginerSet1.getStationeries(), new SortByPrice());

		for (Stationery stationery : begginerSet1.getStationeries()) {
			System.out.println(stationery.getPrice() + " " + stationery.toString());
		}

		BegginerSet begginerSet2 = new BegginerSet();
		
		Collections.sort(begginerSet2.getStationeries(), new SortByItem());

		for (Stationery stationery : begginerSet2.getStationeries()) {
			System.out.println(stationery.toString());
		}

		BegginerSet begginerSet3 = new BegginerSet();
		
		Collections.sort(begginerSet3.getStationeries(), new SortByPriceAndItem());

		for (Stationery stationery : begginerSet3.getStationeries()) {
			System.out.println(stationery.getPrice() + " " + stationery.toString());
		}
	}
}
