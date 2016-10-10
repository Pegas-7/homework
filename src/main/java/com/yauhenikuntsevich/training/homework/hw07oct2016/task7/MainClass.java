package com.yauhenikuntsevich.training.homework.hw07oct2016.task7;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task6.Submarine;

public class MainClass {
	public static void main(String[] args) throws Exception {
		AnnotationAnalyzer analyzer = new AnnotationAnalyzer();
		analyzer.analyz(Submarine.class);
	}
}
