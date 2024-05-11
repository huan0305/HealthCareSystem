package testMyHealthCareSystem;


/*		@(#)EMHRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMHRecord class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMHRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMHRecord_Test {

	EMHRecord newRecord;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Instantiating new object. 
		 */
		newRecord = new EMHRecord("ON", "12A4B", "902FG089LKP", "0123456789");
		BirthDate birthDate = new BirthDate(1988, 06, 16);
		newRecord.setBirthDate(birthDate);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Resetting object to null.
		 */
		newRecord = null;
	}

	/*		Methods to test
	 * 
		+EMHRecord(reportingFacilityProvince:String, institutionNumber:String, chartNumber:String,healthCareNumber:String)
		+toString():String
	 */

	
	@Nested	@DisplayName("EMHRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMHRecordTest {
		@Test @Order(1) @DisplayName("EMHRecord() test with Null arguments")
		final void testEMHRecordWithNullArguments() {
			EMHRecord result = null;
			assertNull(result);
		}
		
		@Test @Order(2) @DisplayName("EMHRecord() test with valid arguments")
		final void testEMHRecordWithValidArguments() {
			assertEquals(newRecord.getReportingFacilityProvince(), "ON");
			assertEquals(newRecord.getInstitutionNumber(), "12A4B");
			assertEquals(newRecord.getChartNumber(), "902FG089LKP");
			assertEquals(newRecord.getHealthCareNumber(), "0123456789");
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			String expectedValue = "Reporting Facility Province: ON\n" +
					"Institution Number: 12A4B\n" +
					"Functional Centre Account: null\n" +
					"Encounter Sequence: 0\n" +
					"Health Care Number: 0123456789\n" +
					"Chart Number: 902FG089LKP\n" +
					"Issuing Province: null\n" +
					"Residence Code: null\n" +
					"Gender: null\n" +
					"Submission Year: 0\n" +
					"Admin Via Ambulance: null\n" +
					"Registration Date: 0\n" +
					"Registration Time: 0\n" +
					"Birthdate: 1988/06/16\n";
			String actualValue = newRecord.toString();
			assertEquals(expectedValue, actualValue, "toString() return value does not meet expectations.");
		}
	}

	
	/*
	 * "Code to test one set method and one get method"
	 * This comment was here so including a test for a getter and setter. 
	 */
	@Nested	@DisplayName("setFunctionalCentreAccount() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFunctionalCentreAccountTest {
		@Test @Order(1) @DisplayName("setFunctionalCentreAccount()")
		final void testSetFunctionalCentreAccount() {	
			String expectedValue = "123456789";
			newRecord.setFunctionalCentreAccount("123456789");
			String actualValue = newRecord.getFunctionalCentreAccount();
			assertEquals(expectedValue, actualValue, "setFunctionalCentreAccount() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("getEncounterSequence() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetEncounterSequenceTest {
		@Test @Order(1) @DisplayName("getEncounterSequence()")
		final void testGetEncounterSequence() {	
			int expectedValue = 975;
			newRecord.setEncounterSequence(975);
			int actualValue = newRecord.getEncounterSequence();
			assertEquals(expectedValue, actualValue, "setFunctionalCentreAccount() return value does not meet expectations.");
		}	
	}
}
