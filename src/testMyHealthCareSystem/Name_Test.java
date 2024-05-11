package testMyHealthCareSystem;


/*		@(#)Name_Test.java	Jan. 31, 2024
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
* Test class for testing the Name class
* Uses JUnit version 5
* @author Reg Dyer modified by Brian Huang
* @version 1.0.0
*/
@DisplayName("Test My HealthCare Application Domain - Name")
@TestMethodOrder(OrderAnnotation.class)
public class Name_Test {

	Name newName;
	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * Instantiating new object. 
		 */
		newName = new Name("John", "Smith", "Gary");
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 *	Resetting object to null.
		 */
		newName = null;
	}
	
	@Nested	@DisplayName("Name() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class NameTest {
		@Test @Order(1) @DisplayName("Name() test with Null arguments")
		final void testNameWithNullArguments() {
			Name result = new Name();
			assertNotNull(result);
		}
		/*
		 * Test for overloaded constructor. 
		 */
		@Test @Order(2) @DisplayName("Name() test with two arguments")
		final void testNameWithTwoArguments() {
			Name result = new Name("Steve", "Jobs");
			String expectedValue = "null. Steve  Jobs";
			String actualValue = result.formattedName();
			assertEquals(expectedValue, actualValue, "Name(first, last) return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("toString() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ToStringTest {
		@Test @Order(1) @DisplayName("toString()")
		final void testToString() {
	
			String expectedValue = "Name: [salutation=null, first=John, middle=Gary, last=Smith]";
			String actualValue = newName.toString();
			assertEquals(expectedValue, actualValue, "toString() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("formattedName() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FormattedName {
		@Test @Order(1) @DisplayName("formattedName()")
		final void testFormattedName() {
			
			String expectedValue = "null. John Gary Smith";
			String actualValue = newName.formattedName();
			assertEquals(expectedValue, actualValue, "formattedName() return value does not meet expectations.");
		}
	}

	@Nested	@DisplayName("setFirst() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetFirstTest {
		@Test @Order(1) @DisplayName("setFirst()")
		final void testSetFirst() {
			
			String expectedValue = "Samantha";
			newName.setFirst("Samantha");
			String actualValue = newName.first();
			assertEquals(expectedValue, actualValue, "setFirst() return value does not meet expectations.");
		}	
	}
	
	@Nested	@DisplayName("setLast() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetLastTest {
		@Test @Order(1) @DisplayName("setLast()")
		final void testSetLast() {
			
			String expectedValue = "Walker";
			newName.setLast("Walker");
			String actualValue = newName.last();
			assertEquals(expectedValue, actualValue, "setLast() return value does not meet expectations.");
		}	
	}

	@Nested	@DisplayName("setMiddle() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetMiddleTest {
		@Test @Order(1) @DisplayName("setMiddle()")
		final void testMiddle() {
			
			String expectedValue = "Gary";
			String actualValue = newName.middle();
			assertEquals(expectedValue, actualValue, "setMiddle() return value does not meet expectations.");	
		}	
	}

	@Nested	@DisplayName("setSalutation() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class SetSalutationTest {
		@Test @Order(1) @DisplayName("setSalutation()")
		final void testSetSalutation() {
			
			String expectedValue = "Mr. John Gary Smith";
			newName.setSalutation("Mr");
			String actualValue = newName.formattedName();
			assertEquals(expectedValue, actualValue, "setSalutation() return value does not meet expectations");
		}
	}
	
	@Nested	@DisplayName("first() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class FirstTest {
		@Test @Order(1) @DisplayName("first()")
		final void testFirst() {
			
			String expectedValue = "John";
			String actualValue = newName.first();
			assertEquals(expectedValue, actualValue, "first() return value does not meet expectations");
		}
	}

	@Nested	@DisplayName("last() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class LastTest {
		@Test @Order(1) @DisplayName("last()")
		final void testlast() {
			
			String expectedValue = "Smith";
			String actualValue = newName.last();
			assertEquals(expectedValue, actualValue, "last() return value does not meet expectations");
		}
	}
}
