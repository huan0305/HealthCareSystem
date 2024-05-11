package myHealthCareSystem;

/**
 * This is a subclass that extends to the superclass EMHRecord. It allows the setting of height, weight, name, and address. 
 * 
 * @see Name, Address, BirthDate, EMHRecord, MedicalCalculator
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class EMRecord extends EMHRecord		{
		
	/** Height in inches. */
	private int height;
	/** Weight in lbs. */
	private int weight; 
	/** Name of patient. */
	private Name name;
	/** Address of patient */
	private Address address;
	
	/*	Constructors		************************************/
	
	/**
	 * Constructs an object of EMRecord with the following parameters.  
	 * @param reportingFacilityProvince	Reporting Facility Province
	 * @param institutionNumber			Institution Number
	 * @param chartNumber				Chart Number
	 * @param healthCareNumber			Health Care Number
	 */
	public EMRecord(String reportingFacilityProvince, String institutionNumber, String chartNumber, String healthCareNumber) {
		super(reportingFacilityProvince, institutionNumber, chartNumber, healthCareNumber);
	}
	
	/*	Accessors			************************************/	
	
	/**
	 * Gets the height of the patient.  
	 * @return Height of patient in inches.
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Gets the weight of the patient. 
	 * @return Weight of patient in lbs. 
	 */
	public int getWeight() {
		return weight;
	}
	
	/* Modifiers			************************************/
	
	/**
	 * Sets the name of the patient. 
	 * @param name	New name of patient. 
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Sets the address of the patient. 
	 * @param address	New address of patient. 
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * Sets the height of the patient. 
	 * @param height	New height of patient. 
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Sets the weight of the patient.  
	 * @param weight	New weight of patient. 
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Formats the object into string with salutation, first, middle, and last name in that order. 
	 * @return This object as a formatted string. 
	 */
	public String formattedName() {
		return name.formattedName();
	}
	
	/**
	 * Converts this object into a formatted string with the street number, street name, city, country, postal code in that order. 
	 * @return This object as a formatted string. 
	 */
	public String formattedAddress() {
		return address.formattedAddress();
	}
	
	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString() {
		String className = getClass().getSimpleName();
		return String.format("%s:\nName: %s\nAddress: %s\nHeight: %s inches\nWeight: %s lbs\n%s", className, formattedName(), formattedAddress(), height, weight, super.toString());
	}
	
	/*	Helper Methods		************************************/
	
	/**
	 * Calculates the patient's BMI with height and weight.
	 * @return The BMI as an integer.
	 */
	public int bmi() {
		int bmi = (int)MedicalCalculator.calculateBMI(weight, height);
		return bmi;
	}
}
