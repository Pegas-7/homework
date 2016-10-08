package com.yauhenikuntsevich.training.homework.hw07oct2016.task1;


/**
 * Class keeps information about note which can added in notebook.
 * Also class contains counter for id of note.
 * @author Evgeni Kuntsevich
 *
 */
public class Note {
	/**
	 * Field contains last actually id
	 */
	private static long idCounter;
	
	/**
	 * Field keeps id for specific note
	 */
	private Long id;
	
	/**
	 * Field for keeps data which write in note
	 */
	private String note;

	/**
	 * Default constructor
	 */
	public Note() {
		idGenerator();
		this.id = idCounter;
	}
	
	/**
	 * Constructor with field note
	 */
	public Note(String note) {
		idGenerator();
		this.id = idCounter;
		this.note = note;
	}

	/**
	 * Generator id for identification note
	 */
	private static void idGenerator() {
		idCounter++;
	}

	/**
	 * Getter for field note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Setter for field note
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	/**
	 * Getter for field id
	 */
	public Long getId() {
		return id;
	}
}
