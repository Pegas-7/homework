package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByItem;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByPrice;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.comporators.SortByPriceAndItem;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.Notebook;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.PaperForPrint;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pen;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pencil;

/**
 * Class specified for testing comparators
 * 
 * @author Evgeni Kuntsevich
 *
 */
public class MainClass {
	public static void main(String[] args) {
		BegginerSet begginerSet1 = new BegginerSet(new Pen(5), new Pencil(6), new PaperForPrint(15), new Notebook(15),
				new SortByPrice());

		for (Stationery stationery : begginerSet1.getStationeries()) {
			System.out.println(stationery.getPrice() + " " + stationery.toString());
		}

		BegginerSet begginerSet2 = new BegginerSet(new Pen(5), new Pencil(3), new PaperForPrint(30), new Notebook(15),
				new SortByItem());

		for (Stationery stationery : begginerSet2.getStationeries()) {
			System.out.println(stationery.toString());
		}

		BegginerSet begginerSet3 = new BegginerSet(new Pen(5), new Pencil(5), new PaperForPrint(15), new Notebook(30),
				new SortByPriceAndItem());

		for (Stationery stationery : begginerSet3.getStationeries()) {
			System.out.println(stationery.getPrice() + " " + stationery.toString());
		}
	}
}
