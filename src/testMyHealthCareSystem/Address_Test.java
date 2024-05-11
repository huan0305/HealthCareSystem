package testMyHealthCareSystem;


/*		@(#)Address_Test.java	Jan. 31, 2024
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
* Test class for testing the Address class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Address")
@TestMethodOrder(OrderAnnotation.class)
public class Address_Test {

	Address newAddress;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Instantiating new object. 
		 */
		newAddress = new Address("Woodroffe Ave.", "383", "Ottawa", "K4F 3G5");
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Resetting object to null.
		 */
		newAddress = null;
	}
	
	@Nested	@DisplayName("Address() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class AddressTest {
		@Test @Order(1) @DisplayName("Address() test with Null arguments")
		final void testAddressWithNullArguments() {
			Address result = new Address(null, null, null, null);
			assertNotNull(result);
		}
		
		/*
		 * Test with overloaded constructor. 
		 */
		@Test @Order(2) @DisplayName("Address() test with valid arguments")
		final void testAddressWithValidArguments() {
			Address result = new Address("Main St.", "1", "Ottawa", "K9P 1R6");
			result.setCountry("Canada");
			String expectedValue = "1 Main St., Ottawa, Canada, K9P 1R6";
			String actualValue = result.formattedAddress();
			assertEquals(expectedValue, actualValue, "Address() return value does not meet expectations.");	
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
			String expectedValue = "Address: [street=Woodroffe Ave., number=383, city=Ottawa, country=null, postalCode=K4F 3G5]";
			String actualValue = newAddress.toString();
			assertEquals(expectedValue, actualValue, "toString() return value does not meet expectations.");
		}
	}
	
	@Nested	@DisplayName("formattedAddress() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedAddress {
		@Test @Order(1) @DisplayName("formattedAddress()")
		final void testFormattedAddress() {
			String expectedValue = "383 Woodroffe Ave., Ottawa, null, K4F 3G5";
			String actualValue = newAddress.formattedAddress();
			assertEquals(expectedValue, actualValue, "formattedAddress() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("postalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class PostalCodeTest {
		@Test @Order(1) @DisplayName("postalCode()")
		final void testPostalCode() {
			String expectedValue = "K4F 3G5";
			String actualValue = newAddress.postalCode();
			assertEquals(expectedValue, actualValue, "postalCode() return value does not meet expectations.");
		}	
	}

	@Nested	@DisplayName("getCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GetCityTest {
		@Test @Order(1) @DisplayName("getCity()")
		final void testGetCity() {
			String expectedValue = "Ottawa";
			String actualValue = newAddress.getCity();
			assertEquals(expectedValue, actualValue, "getCity() return value does not meet expectations.");
		}	
	}

	
	@Nested	@DisplayName("setStreet() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetStreetTest {
		@Test @Order(1) @DisplayName("setStreet()")
		final void testSetStreet() {
			newAddress.setStreet("Merivale Rd.");
			String expectedValue = "Merivale Rd.";
			String actualValue = newAddress.street();
			assertEquals(expectedValue, actualValue, "setStreet() return value does not meet expectations.");
		}
	}
	
	@Nested	@DisplayName("setNumber() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetNumberTest {
		@Test @Order(1) @DisplayName("setNumber()")
		final void testSetNumber() {
			newAddress.setNumber("1234");
			String expectedValue = "1234 Woodroffe Ave., Ottawa, null, K4F 3G5";
			String actualValue = newAddress.formattedAddress();
			assertEquals(expectedValue, actualValue, "setStreet() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("setCity() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCityTest {
		@Test @Order(1) @DisplayName("setCity()")
		final void testSetCity() {
			newAddress.setCity("Montreal");
			String expectedValue = "Montreal";
			String actualValue = newAddress.getCity();
			assertEquals(expectedValue, actualValue, "setCity() return value does not meet expectations.");
		}
	}
	
	@Nested	@DisplayName("setCountry() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetCountryTest {
		@Test @Order(1) @DisplayName("setCountry()")
		final void testSetCountry() {
			newAddress.setCountry("Mexico");
			String expectedValue = "383 Woodroffe Ave., Ottawa, Mexico, K4F 3G5";
			String actualValue = newAddress.formattedAddress();
			assertEquals(expectedValue, actualValue, "setCountry() return value does not meet expectations.");
		}
	}
	
	@Nested	@DisplayName("setPostalCode() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetPostalCodeTest {
		@Test @Order(1) @DisplayName("setPostalCode()")
		final void testSetCountry() {
			newAddress.setPostalCode("N6H 4Y7");
			String expectedValue = "N6H 4Y7";
			String actualValue = newAddress.postalCode();
			assertEquals(expectedValue, actualValue, "setPostalCode() return value does not meet expectations.");
		}
	}
}
