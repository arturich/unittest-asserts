package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
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

}
