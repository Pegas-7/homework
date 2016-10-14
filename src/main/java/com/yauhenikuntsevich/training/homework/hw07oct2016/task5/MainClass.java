package com.yauhenikuntsevich.training.homework.hw07oct2016.task5;

public class MainClass {

	public static void main(String[] args) {
		University university = new University();
		
		Student student1 = new Student("Ivan", "Dulin");
		Student student2 = new Student("Stas", "Trik");
		Student student3 = new Student("Maks", "Sert");
		Student student4 = new Student("Sasha", "Webyk");
		Student student5 = new Student("Gena", "Molin");
		
		Discipline math = new Discipline("Math");
		Discipline phisic = new Discipline("Phisic");
		Discipline biologic = new Discipline("Biologic");
		
		Group group1 = new Group(math);
		Group group2 = new Group(phisic);
		Group group3 = new Group(biologic);
		
		group1.addStudentInGroup(student1, 5);
		group2.addStudentInGroup(student1, 6.0);
		group3.addStudentInGroup(student1, 9.3);
		group1.addStudentInGroup(student2, 4.0);
		group3.addStudentInGroup(student2, 3);
		group1.addStudentInGroup(student3, 5.5);
		group2.addStudentInGroup(student3, 4.4);
		group3.addStudentInGroup(student4, 7.1);
		group2.addStudentInGroup(student4, 3.9);
		group1.addStudentInGroup(student5, 8);
		group2.addStudentInGroup(student5, 6.1);
		group3.addStudentInGroup(student5, 9.9);
		
		university.addGroup(group1);
		university.addGroup(group2);
		university.addGroup(group3);
		
		university.printGradeOneStudent(student1);
	}

}
