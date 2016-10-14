package com.yauhenikuntsevich.training.homework.hw07oct2016.task5;

import java.util.HashMap;
import java.util.Map;

public class Group {
	private Map<Student, Number> students = new HashMap<>();
	private Discipline discipline;

	public Group(Discipline discipline) {
		this.discipline = discipline;
	}

	public void addStudentInGroup(Student student, Number grade) {
		students.put(student, grade);
	}

	public Map<Student, Number> getStudents() {
		return students;
	}

	public Discipline getDiscipline() {
		return discipline;
	}
}
