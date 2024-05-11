package myHealthCareSystem;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Class to apply calculations to specific type of EMR's and data.
 * Currently supports BMI (Body Mass Index) calculations.
 * 
 * @see Name, BirthDate, EMHRecord, EMRecord, Address
 * @author Brian Huang
 * @version 1.0
 * @since 21.0.1
 */
public class MedicalCalculator {
	private MedicalCalculator()	{
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * @param weight  Weight of the patient in pounds.
	 * @param height  Height of the patient in inches.
	 */
	public static double calculateBMI(double weight, double height) {
		return (weight == 0 || height == 0)  ? 0 : round((weight * 703 / (height * height)), 1);
	}

	/**
	 * Main entry point for quick and dirty test purposes.
	 * @param args Command line arguments submitted thru the VM
	 */
	public static void main(String[] args) {
		System.out.println("BMI:" + calculateBMI(0, 0));
		System.out.println("BMI:" + calculateBMI(0, 69));
		System.out.println("BMI:" + calculateBMI(165, 0));
		System.out.println("BMI:" + calculateBMI(165, 69));
		System.out.println("BMI:" + calculateBMI(295, 69));

		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}
	
	/**
	 * Round the calculated BMI to 1 decimal place
	 * @param value		BMI calculated value
	 * @param places		Number of rounding positions
	 * @return	The rounded value
	 */
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    double roundedValue = 0;
	    if (value != 0)	{
	   	 BigDecimal bd = BigDecimal.valueOf(value);
	   	 bd = bd.setScale(places, RoundingMode.HALF_UP);
	   	 roundedValue = bd.doubleValue();
	    }

	    return roundedValue;
	}
	
	/**
	 * This method returns the incorrectly calculated Body Mass Index (BMI) from data provided. 
	 * @param weight 	Weight of the patient in pounds.
	 * @param height 	Height of the patient in inches.
	 */
	public static double incorrectBMI(double weight, double height) {
		/* The error is the height is multiplied by weight rather than by itself (height * height). */
		return (weight == 0 || height == 0)  ? 0 : round((weight * 703 / (weight * height)), 1);	
	}
}
