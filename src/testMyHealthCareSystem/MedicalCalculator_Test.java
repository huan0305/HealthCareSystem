package testMyHealthCareSystem;


/*		@(#)MedicalCalculator_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import myHealthCareSystem.*;


/**
* Test class for testing the MedicalCalculator class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain")
@TestMethodOrder(OrderAnnotation.class)
public class MedicalCalculator_Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Nested	@DisplayName("calculateBMI() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class calculateBMITest {

		@Test @Order(1) @DisplayName("calculateBMI() test with Null arguments")
		final void testCalculateBMIWithNullArguments() {
			double result = MedicalCalculator.calculateBMI(0.0, 0.0);
			System.out.println("calculateBMI() ->BMI:" + result);
			assertEquals(result,0);
		}
		
		@Test @Order(2) @DisplayName("calculateBMI() test with height = 0")
		final void testCalculateBMIWithHeightZero() {
			double result = MedicalCalculator.calculateBMI(165, 0);
			System.out.println("calculateBMI(165,0) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(2) @DisplayName("calculateBMI() test with weight = 0")
		final void testCalculateBMIWithWeightZero() {
			double result = MedicalCalculator.calculateBMI(0, 69);
			System.out.println("calculateBMI(0,69) ->BMI:" + result);
			assertEquals(result,0);
		}

		@Test @Order(2) @DisplayName("calculateBMI() test with valid arguments")
		final void testCalculateBMIWithValidArguments() {
			double result = MedicalCalculator.calculateBMI(165, 69);
			System.out.println("calculateBMI(165,69) ->BMI:" + result);
			assertEquals(result,24.4);
		}
	}
	
	@Nested	@DisplayName("incorrectBMI() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class incorrectBMITest {

		@Test @Order(1) @DisplayName("incorrectBMI() test with incorrect calculations")
		final void testIncorrectBMI() {
			double correctResult = MedicalCalculator.calculateBMI(165, 69);
			double incorrectResult = MedicalCalculator.incorrectBMI(165, 69);
			System.out.println("calculateBMI(165,69) ->BMI:" + correctResult);
			System.out.println("incorrectBMI(165,69) ->BMI:" + incorrectResult);
			assertEquals(correctResult, incorrectResult, "incorrectBMI()");
		}
	}
}	/*	End of test classes					*/
