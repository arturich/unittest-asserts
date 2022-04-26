package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTest {
	
	
	@Test
	@DisplayName("Disabled test")
	@Disabled("Don't run util JIRA #123 is resolved")
	void basiTest()
	{
		
	}
	
	@Test
	@DisplayName("Enabled on OS test Windows")
	@EnabledOnOs(OS.WINDOWS)
	void testForWindows()
	{
		
	}
	
	@Test
	@DisplayName("Enabled on OS test Mac")
	@EnabledOnOs(OS.MAC)
	void testForMac()
	{
		
	}
	
	@Test
	@DisplayName("Enabled on OS test Mac or Windows")
	@EnabledOnOs( {OS.MAC, OS.WINDOWS})
	void testForMacOrWindows()
	{
		
	}
	
	@Test
	@DisplayName("Enabled on OS test Linux")
	@EnabledOnOs(OS.LINUX)
	void testForLinux()
	{
		
	}
	
	@Test
	@DisplayName("Conditional for Java 17")
	@EnabledOnJre(JRE.JAVA_17)
	void testForJava17Only()
	{
		
	}
	
	@Test
	@DisplayName("Conditional for Java 13")
	@EnabledOnJre(JRE.JAVA_13)
	void testForJava13Only()
	{
		
	}
	
	@Test
	@DisplayName("Conditional JRE between Java 13 and Java 18")
	@EnabledForJreRange(min=JRE.JAVA_13, max=JRE.JAVA_18)
	void testForJavaRange()
	{
		
	}
	
	@Test
	@DisplayName("Conditional JRE minimal Java 11")
	@EnabledForJreRange(min=JRE.JAVA_11)
	void testForJavaRangeMin()
	{
		
	}

}
