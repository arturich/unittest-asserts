package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
	
	DemoUtils demoUtils;
	
	@BeforeAll
	static void setupBeforeEachClass()
	{
		System.out.println("@BeforeAll executes only once before all tests method exec");
	}
	
	@BeforeEach
	void setupBeforeEach() {
		demoUtils = new DemoUtils();
		System.out.println("@Beforeach executes before the execution of each method");
	}
	
	@AfterEach
	void tearDownAfterEach()
	{
		System.out.println("Running the @AfterEach");
	}
	

	@Test
	@DisplayName("Equals and Not Equals")
	@Order(1)
	void testEqualsAndNotEquals() {
		
		System.out.println("Running test: testEqualsAndNotEquals" );
		
						
		// Execute
		
		int result = demoUtils.add(2, 4);
		
		// Assert
		assertEquals(6,result," 2 + 4 must be 6");		
		assertNotEquals(3,result, "2 + 4 must not be 3");	
		
	}
	
	@Test
	@DisplayName("Test Null And not Null")
	@Order(3)
	void testNullAndNotNull()
	{
		System.out.println("Running test: testNullAndNotNull" );		
		
		String str1 = null;
		String str2 = "luv2Code";
		
		assertNull(demoUtils.checkNull(str1),"Object should be null");
		assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
	}
	
	@Test
	@DisplayName("Check if it is the same object")
	void testSameAndNotSame()
	{
		String str = "luv2code";
		assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate());
		assertNotSame(str, demoUtils.getAcademy());
	}
	
	@Test
	@DisplayName("Check True of False")
	void testTrueFalse()
	{
		int gradeOne = 10;
		int gradeTwo = 5;
		
		assertTrue(demoUtils.isGreater(gradeOne, gradeTwo));
		assertFalse(demoUtils.isGreater(gradeTwo, gradeOne));
			
	}
	
	
	@Test
	@DisplayName("Array Equals")
	void testArrayEquals()
	{
		String[] stringArray = {"A", "B","C"};
		
		assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),"Array should be de same as A, B and C");
		
	}
	
	@Test
	@DisplayName("Iterable Equals")
	void testIterableEquals()
	{
		 List<String> theList = List.of("luv", "2", "code");
		 assertIterableEquals(theList, demoUtils.getAcademyInList(),"Expected list should be with luv 2 code");
	}
	
	@Test
	@DisplayName("Lines match")
	void testLinesMatch()
	{
		 List<String> theList = List.of("luv", "2", "code");
		 assertLinesMatch(theList, demoUtils.getAcademyInList(),"Lines should match");
	}
	
	
	@Test
	@DisplayName("Throws and does not Throw")
	void testThrowsAndDoesNotThrow()
	{
		assertThrows(Exception.class,() -> {demoUtils.throwException(-1);}, "Should Throw an exception");
		
		assertDoesNotThrow(() -> {demoUtils.throwException(0);}, "Should NOT Throw an exception");
		
	}
	
	@Test
	@DisplayName("Timeout")
	void testTimeout()
	{
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout();},"Method should execute in max 3 seconds.");
	}
	
	@Test
	@DisplayName("Multiplication validation")
	void testMultiply()	
	{
		assertEquals(9, demoUtils.multiply(3, 3), " 3 * 3 should be 9");
	}
	
	@AfterAll
	static void setupAfterEachClass()
	{
		System.out.println("@AfterAll executes only once after all tests method exec");
	}
	
	
	

}
