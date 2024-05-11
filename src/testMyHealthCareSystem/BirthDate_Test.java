package testMyHealthCareSystem;
// This test is done. 

/*		@(#)BirthDate_Test.java	Jan. 31, 2024
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
* Test class for testing the BirthDate class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - BirthDate")
@TestMethodOrder(OrderAnnotation.class)
public class BirthDate_Test {

	BirthDate birthDate;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Instantiating new object. 
		 */
		birthDate = new BirthDate(1988, 06, 16);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Resetting object to null.
		 */
		birthDate = null;
	}
	
	@Nested	@DisplayName("BirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BirthDateTest {
		@Test @Order(1) @DisplayName("BirthDate() test with Null arguments")
		final void testBirthDateWithNullArguments() {
			BirthDate result = new BirthDate(0,0,0);
			assertNotNull(result);
		}
		/*
		 * Code to test for valid arguments.
		 */
		@Test @Order(2) @DisplayName("BirthDate() test with Valid arguments")
		final void testBirthDateWithValidArguments() {
			BirthDate result = new BirthDate(1980,02,03);
			assertEquals(1980, result.getYear());
			assertEquals(02, result.getMonth());
			assertEquals(03, result.getDay());
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			
			String expectedValue = "BirthDate[year=1988, month=6, day=16]";
			String actualValue = birthDate.toString();
			assertEquals(expectedValue, actualValue, "toString() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("formattedBirthDate() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedBirthDate {
		@Test @Order(1) @DisplayName("formattedBirthDate()")
		final void testFormattedBirthDate() {
			
			String expectedValue = "1988/06/16";
			String actualValue = birthDate.formattedBirthDate();
			assertEquals(expectedValue, actualValue, "formattedBirthDate() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("getDay() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetDayTest {
		@Test @Order(1) @DisplayName("getDay()")
		final void testGetDay() {
			
			int expectedValue = 16;
			int actualValue = birthDate.getDay();
			assertEquals(expectedValue, actualValue, "getDay() return value does not meet expectations.");
		}	
	}

	@Nested	@DisplayName("getMonth() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetMonthTest {
		@Test @Order(1) @DisplayName("getMonth()")
		final void testGetMonth() {
			
			int expectedValue = 6;
			int actualValue = birthDate.getMonth();
			assertEquals(expectedValue, actualValue, "getMonth() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("getYear() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetYearTest {
		@Test @Order(1) @DisplayName("getYear()")
		final void testGetYear() {
			
			int expectedValue = 1988;
			int actualValue = birthDate.getYear();
			assertEquals(expectedValue, actualValue, "getYear() return value does not meet expectations.");
		}	
	}

}
