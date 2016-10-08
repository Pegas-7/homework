package com.yauhenikuntsevich.training.homework.hw07oct2016.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class specified for keeps note in notebook and handled it
 * @author Evgeni Kuntsevich
 *
 */
public class Notebook {
	/**
	 *Array for keeps list with notes
	 */
	private List<Note> notes = new ArrayList<Note>();

	/**
	 *Method adds specified note in list
	 */
	public boolean addNote(Note note) {
		if (note != null) {
			notes.add(note);
			return true;
		} else
			return false;
	}

	/**
	 *Method deletes specified note from list
	 */
	public boolean deleteNote(Note note) {
		if (note != null) {
			notes.remove(indexNoteFromArray(note));
			return true;
		} else
			return false;
	}

	/**
	 *Method updates specified note in list
	 */
	public boolean updateNote(Note note) {
		if (note != null) {
			notes.get(indexNoteFromArray(note)).setNote(note.getNote());
			;
			return true;
		} else
			return false;
	}

	/**
	 *Method prints all notes from list
	 */
	public boolean readAllNotes() {
		if (notes.size() != 0) {
			for (Note note : notes) {
				System.out.println(note.getNote());
			}
			return true;
		} else
			return false;
	}

	/**
	 *Method return number of specified note from list
	 */
	public int indexNoteFromArray(Note note) {
		int note1 = -1;

		for (int i = 0; i < notes.size(); i++) {
			if (note.getId() == notes.get(i).getId()) {
				note1 = i;
			}
		}
		return note1;
	}
}
