package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.Notebook;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.PaperForPrint;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pen;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pencil;

public class BegginerSet {
	private LinkedList<Stationery> stationeries;

	public BegginerSet() {
		this.stationeries = new LinkedList<>();
		stationeries.add(new Pen(7));
		stationeries.add(new Pencil(4));
		stationeries.add(new PaperForPrint(15));
		stationeries.add(new Notebook(11));
	}

	public LinkedList<Stationery> getStationeries() {
		return stationeries;
	}
}
