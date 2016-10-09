package com.yauhenikuntsevich.training.homework.hw07oct2016.task2;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task2.stationery.Notebook;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task2.stationery.Pen;
import com.yauhenikuntsevich.training.homework.hw07oct2016.task2.stationery.Ruler;

public class MainClass {

	public static void main(String[] args) {
		Workplace workplace = new Workplace();
		
		Pen pen = new Pen(12);
		Ruler ruler = new Ruler(17);
		Notebook notebook = new Notebook(25);
		
		workplace.stationeries.add(pen);
		workplace.stationeries.add(ruler);
		workplace.stationeries.add(notebook);
		
		System.out.println(workplace.priceAllStationeries());
	}
}
