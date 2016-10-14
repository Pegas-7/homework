package com.yauhenikuntsevich.training.homework.hw07oct2016.task5;

import java.util.ArrayList;
import java.util.List;

public class University {
	private List<Group> groups = new ArrayList<>();

	public void printGradeOneStudent(Student student) {
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		for (Group group : groups) {
			if (group.getStudents().get(student) == null) {
				continue;
			} else {
				System.out.println("Discipline: " + group.getDiscipline().getName() + ", grade: "
						+ group.getStudents().get(student));
			}
		}
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void addGroup(Group group) {
		groups.add(group);
	}
}
