package com.yauhenikuntsevich.training.homework.hw07oct2016.task3;

import java.util.ArrayList;
import java.util.List;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.Stationery;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.paperproduct.Notebook;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.paperproduct.PaperForPrint;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.paperproduct.PaperProduct;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.writingaccessories.Pen;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task3.stationery.writingaccessories.Pencil;

public class BegginerSet {
	private List<Stationery> stationeries = new ArrayList<>();

	public BegginerSet(Pen pen, Pencil pencil, PaperForPrint paperForPrint, Notebook notebook) {
		stationeries.add(pen);
		stationeries.add(pencil);
		stationeries.add(paperForPrint);
		stationeries.add(notebook);
	}

	public List<Stationery> getStationeries() {
		return stationeries;
	}
}
