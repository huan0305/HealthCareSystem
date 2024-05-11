package testMyHealthCareSystem;
// toString does not work

/*		@(#)EMRecord_Test.java	Jan. 31, 2024
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
* Test class for testing the EMRecord class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - EMRecord")
@TestMethodOrder(OrderAnnotation.class)
public class EMRecord_Test {
	
	EMRecord newRecord;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Instantiating new object. 
		 */
		newRecord = new EMRecord("ON", "12A4B", "902FG089LKP", "0123456789");
		Name patient = new Name("Bob", "Barker");
		newRecord.setName(patient);
		Address address = new Address("Turnabout Road", "765", "Ottawa", "K4G 6Y7");
		newRecord.setAddress(address);
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

	@Nested	@DisplayName("EMRecord() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class EMRecordTest {
		@Test @Order(1) @DisplayName("EMRecord() test with Null arguments")
		final void testEMRecordWithNullArguments() {
			EMRecord result = null;
			assertNull(result);
		}
		
		@Test @Order(2) @DisplayName("EMRecord() test with valid arguments")
		final void testEMRecordWithValidArguments() {
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
			String expectedValue = "EMRecord:\n" +
				"Name: null. Bob  Barker\n" +
				"Address: 765 Turnabout Road, Ottawa, null, K4G 6Y7\n" +
				"Height: 0 inches\n" +
				"Weight: 0 lbs\n" +
				"Reporting Facility Province: ON\n" +
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
			assertEquals(expectedValue, actualValue,"toString() return value does not meet expectations.");
		}
	}
	
	@Nested	@DisplayName("setName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNameTest {
		@Test @Order(1) @DisplayName("setName()")
		final void testSetName() {
			Name name = new Name("Samantha", "Walker");
			newRecord.setName(name);
			String expectedValue = "null. Samantha  Walker";
			String actualValue = newRecord.formattedName();
			assertEquals(expectedValue, actualValue, "setName() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("setAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetAddressTest {
		@Test @Order(1) @DisplayName("setAddress()")
		final void testSetAddress() {
			Address address = new Address("Main St.", "432", "Ottawa", "K1G 6U7");
			newRecord.setAddress(address);
			String expectedValue = "432 Main St., Ottawa, null, K1G 6U7";
			String actualValue = newRecord.formattedAddress();
			assertEquals(expectedValue, actualValue, "setAddress() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("setHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetHeightTest {
		@Test @Order(1) @DisplayName("setHeight()")
		final void testSetHeight() {
			newRecord.setHeight(72);
			int expectedValue = 72;
			int actualValue = newRecord.getHeight();
			assertEquals(expectedValue, actualValue, "setHeight() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("getHeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetHeightTest {
		@Test @Order(1) @DisplayName("getHeight()")
		final void testGetHeight() {
			newRecord.setHeight(82);
			int expectedValue = 82;
			int actualValue = newRecord.getHeight();
			assertEquals(expectedValue, actualValue, "getHeight() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("setWeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetWeightTest {
		@Test @Order(1) @DisplayName("setWeight()")
		final void testSetWeight() {
			newRecord.setWeight(150);
			int expectedValue = 150;
			int actualValue = newRecord.getWeight();
			assertEquals(expectedValue, actualValue, "setWeight() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("getWeight() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetWeightTest {
		@Test @Order(1) @DisplayName("getWeight()")
		final void testGetWeight() {
			newRecord.setWeight(126);
			int expectedValue = 126;
			int actualValue = newRecord.getWeight();
			assertEquals(expectedValue, actualValue, "getWeight() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedNameTest {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			Name name = new Name("John", "Smith");
			newRecord.setName(name);
			String expectedValue = "null. John  Smith";
			String actualValue = newRecord.formattedName();
			assertEquals(expectedValue, actualValue, "formattedName() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddressTest {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			Address address = new Address("Woodroffe Ave.", "123", "Ottawa", "K1G 6U7");
			address.setCountry("Canada");
			newRecord.setAddress(address);
			String expectedValue = "123 Woodroffe Ave., Ottawa, Canada, K1G 6U7";
			String actualValue = newRecord.formattedAddress();
			assertEquals(expectedValue, actualValue, "formattedAddress() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("bmi() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class BMITest {
		@Test @Order(1) @DisplayName("bmi()")
		final void testBMI() {
			newRecord.setHeight(60);
			newRecord.setWeight(120);
			int expectedValue = 23;
			int actualValue = newRecord.bmi();
			assertEquals(expectedValue, actualValue, "bmi() return value does not meet expectations.");
		}	
	}
}
