package myHealthCareSystem;

/**
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 * @see Name, Address, EMHRecord, EMRecord, MedicalCalculator
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class BirthDate {
	
	/*	Attributes			************************************/
	
	/** Birth day */
	private	final	int	day;
	/** Birth month. */
	private	final	int	month;
	/** Birth year.	*/
	private	final	int	year;	
	
	/*	Constructors		************************************/
	
	/**
	 * Create the birth date for this patient.
	 * @param year		Year of birth (4 numeric characters)
	 * @param month		Month of birth (01 thru 12) (2 digit month)
	 * @param day		Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/*	Accessors			************************************/
	
	/**
	 * Gets the patient's birth day.
	 * @return Birth day in 2 digits.
	 */
	public int	getDay() {
		return day;			
	}
	
	/**
	 * Gets the patient's birth month.
	 * @return Birth month in 2 digits.
	 */
	public int	getMonth() {
		return month;		
	}
	
	/**
	 * Gets the patient's birth year.
	 * @return Birth year.
	 */
	public int	getYear() {	
		return year;		
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Convert this object into a formatted string with year, month, day in that order.
	 * @return	This object as a formatted string as YYYY/MM/DD.
	 */
	public String formattedBirthDate()	{
		/*	The code returns a formatted string for the birth date in the format yyyy/mm/dd		 */	
		return String.format("%04d/%02d/%02d", year, month, day);
	}

	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return getClass().getSimpleName() + "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}
}
