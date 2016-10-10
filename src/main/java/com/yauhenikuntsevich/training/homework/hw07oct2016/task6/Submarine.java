package com.yauhenikuntsevich.training.homework.hw07oct2016.task6;

import com.yauhenikuntsevich.training.homework.hw07oct2016.task7.MyAnnotation;

@MyAnnotation(name1 = "submarine")
public class Submarine {
	public void run() {
		System.out.println("Starting engine...");
		
		EngineForSubmarine engineForSubmarine = new EngineForSubmarine();
	}

	private class EngineForSubmarine {

	}
}
