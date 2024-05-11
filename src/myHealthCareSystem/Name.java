package myHealthCareSystem;

/**
 * This class represents the name of the patient. 
 * 
 * @see Address, BirthDate, EMHRecord, EMRecord, MedicalCalculator
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class Name {
	
	/*	Attributes			************************************/
	
	/** First name of patient. */
	private String first;
	/** Last name of patient. */
	private String last;
	/** Middle name of patient. */
	private String middle;
	/** Salutation for patient. */
	private String salutation;
	
	/*	Constructors		************************************/
	
	/**
	 * Create the name for this patient.
	 * @param first		First name of patient.
	 * @param last		Last name of patient
	 * @param middle	Middle name of patient. 
	 */
	public Name() {
		this("", "", "");
	}
	
	/**
	 * Create a name for this patient with a full name.
	 * @param name		Full name of patient.
	 */
	public Name(String name) {
		/* TODO Professor said not required because we haven't learned this */
	}
	
	/**
	 * Create a name for this patient with first and last names.
	 * @param first 	First name of patient.
	 * @param last		Last name of patient. 
	 */
	public Name(String first, String last) {
		this(first, last, "");
	}
	
	/**
	 * Creates a name for this patient with first, middle and last names.
	 * @param first		First name of patient. 
	 * @param last		Last name of patient.
	 * @param middle	Middle name of patient. 
	 */
	public Name(String first, String last, String middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}
	
	/*	Accessors			************************************/
	/* Getters as named in UML diagram. */
	
	/**
	 * Get the first name of patient.
	 * @return First name. 
	 */
	public String first() {
		return first;
	}
	
	/** 
	 * Get the last name of patient. 
	 * @return Last name.
	 */
	public String last() {
		return last;
	}
	
	/**
	 * Get the middle name of patient.
	 * @return Middle name. 
	 */
	public String middle() {
		return middle;
	}
		
	/* Modifiers			************************************/
	
	/**
	 * Set the first name of patient. 
	 * @param first		New first name. 
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	
	/**
	 * Set the last name of patient.
	 * @param last		New last name. 
	 */
	public void setLast(String last) {
		this.last = last;
	}
	
	/**
	 * Set the middle name of patient. 
	 * @param middle	New middle name. 
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	
	/** 
	 * Set the salutation for patient. 
	 * @param salutation	New salutation. 
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString() {
		return getClass().getSimpleName() + ": [salutation=" + salutation + ", first=" + first + ", middle=" + middle + ", last=" + last + "]"; 
	}
	
	/**
	 * Formats the object into string with salutation, first, middle, and last name in that order. 
	 * @return This object as a formatted string. 
	 */
	public String formattedName() {
		return String.format("%s. %s %s %s", salutation, first, middle, last);
	}
}
