package com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.Stationery;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.Notebook;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.paperproduct.PaperForPrint;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pen;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3and4.stationery.writingaccessories.Pencil;

public class BegginerSet {
	private Set<Stationery> stationeries;

	public BegginerSet(Pen pen, Pencil pencil, PaperForPrint paperForPrint, Notebook notebook, Comparator<Stationery> comparator) {
		this.stationeries = new TreeSet<>(comparator);
		stationeries.add(pen);
		stationeries.add(pencil);
		stationeries.add(paperForPrint);
		stationeries.add(notebook);
	}

	public Set<Stationery> getStationeries() {
		return stationeries;
	}
}
