package myHealthCareSystem;

/**
 * This class represents the address of the patient. 
 * 
 * @see Name, BirthDate, EMHRecord, EMRecord, MedicalCalculator
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class Address {
		
	/*	Attributes			************************************/
	
	/** Patient's street name */
	private String street;
	/** Patient's street number */
	private String number;
	/** Patient's city */
	private String city;
	/** Patient's country */
	private String country;
	/** Patient's postal code */
	private String postalCode;
	
	/*	Constructors		************************************/
	
	/**
	 * Creates the address for a patient. 
	 * 
	 * @param street		Patient's street name
	 * @param number		Patient's street number
	 * @param city			Patient's city
	 * @param postalCode	Patient's postal code
	 */
	public Address(String street, String number, String city, String postalCode) {
		this.street = street;
		this.number = number;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	/*	Accessors			************************************/
	/* Getters as named in the UML diagram. */
	
	/**
	 * Get patient's street name. 
	 * @return Street name
	 */
	public String street() {
		return street;
	}
	
	/**
	 * Get patient's postal code. 
	 * @return Postal code
	 */
	public String postalCode() {
		return postalCode;
	}
	
	/**
	 * Get patient's city.
	 * @return City name
	 */
	public String getCity() {
		return city;
	}
	
	/* Modifiers			************************************/
	
	/**
	 * Sets the patient's street name.
	 * @param street	Street name
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/** 
	 * Sets the patient's street number.
	 * @param number	Street number
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * Sets the patient's city.
	 * @param city 		City
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Sets the patient's country.
	 * @param country	Country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Sets the patient's postal code.
	 * @param postalCode	Postal code
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/*	Normal Behavior	************************************/
	
	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString() {
		return getClass().getSimpleName() + ": [street=" + street+ ", number=" + number + ", city=" + city + ", country=" + country + ", postalCode=" + postalCode + "]"; 
	}
	
	/**
	 * Converts this object into a formatted string with the street number, street name, city, country, postal code in that order. 
	 * @return This object as a formatted string. 
	 */
	public String formattedAddress() {
		return String.format("%s %s, %s, %s, %s", number, street, city, country, postalCode);
	}
}
