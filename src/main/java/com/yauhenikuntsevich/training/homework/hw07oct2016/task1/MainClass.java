package com.yauhenikuntsevich.training.homework.hw07oct2016.task1;

/**
 * Class specified for demonstration capabilities of programm
 * @author Evgeni Kuntsevich
 */
public class MainClass {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		
		Note note1 = new Note("First note");
		Note note2 = new Note("Second note");
		Note note3 = new Note("Third note");
		
		notebook.addNote(note1);
		notebook.addNote(note2);
		notebook.addNote(note3);
		
		notebook.readAllNotes();
		System.out.println("Three notes added!\n");
		
		notebook.deleteNote(note2);
		
		notebook.readAllNotes();
		System.out.println("Second note delete!\n");
		
		
		note3.setNote("new third note");
		notebook.updateNote(note3);
		
		notebook.readAllNotes();
		System.out.println("Third note updated!\n");
	}
}
