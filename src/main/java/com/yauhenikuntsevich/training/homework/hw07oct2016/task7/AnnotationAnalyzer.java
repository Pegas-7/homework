package com.yauhenikuntsevich.training.homework.hw07oct2016.task7;

import java.lang.annotation.Annotation;

public class AnnotationAnalyzer {
	public void analyz(Class<?> clazz) throws Exception {
		if (clazz.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
			String atribute = annotation.name1();

			System.out.println("Class " + clazz.getSimpleName() + " was marked annotation \"MyAnnotation\", its "
					+ "atribute = " + atribute);
		}

	}
}
