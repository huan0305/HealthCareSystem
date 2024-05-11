package testMyHealthCareSystem;

import myHealthCareSystem.*;

/**
 * This is a simple test demo class for the health care system. 
 * 
 * @see Name, Address, BirthDate, EMHRecord, EMRecord, MedicalCalculator
 * @author Reg Dyer modified by Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input through the virtual machine.
	 */
	public static void main(String[] args) {
		/* Field values and constraints used from the Standards guide
		 * Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 */
		
		/* Instantiating new name and setting salutation */
		Name patient1 = new Name("Harry", "Walker", "Johnnie");
		patient1.setSalutation("Mr");
		
		/* Instantiating new address and setting country */
		Address address1 = new Address("Turnabout Road", "765", "Ottawa", "K4G 6Y7");
		address1.setCountry("Canada");
		
		/* Instantiating new birth date */
		BirthDate birthDate1 = new BirthDate(1970, 12, 01);
		
		/* Instantiating new EM Record */
		EMRecord record1 = new EMRecord("ON", "12A4B", "902FG089LKP", "0123456789");
		
		/* Setting values for EMHRecord based on Acute and Ambulatory Care Data Content Standard. */
		record1.setFunctionalCentreAccount("123456789");
		record1.setEncounterSequence(975);
		record1.setIssuingProvince("ON");
		record1.setResidenceCode("0PHN987");
		record1.setGender("M");
		record1.setSubmissionYear(2024);
		record1.setAdminViaAmbulance("G");
		record1.setRegistrationDate(20240102);
		record1.setRegistrationTime(1130);
		record1.setBirthDate(birthDate1);
			
		/* Setting height, weight, name, and address into EM Record with patient1 and address1. */
		record1.setHeight(72);
		record1.setWeight(180);
		record1.setName(patient1);
		record1.setAddress(address1);
		
		/* Outputs EMRecord report to console. */
		System.out.printf("%s\n", record1.toString());
	
		/*	Calculating the BMI for your patient record here.
		 * 	Uses the static method in the MedicalCalculator class along with instance variables from the
		 * 	EMHRecord class.
		 */
		System.out.printf("BMI is: %d\n", record1.bmi());

		/*	Following code not modified from original source.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}
}
