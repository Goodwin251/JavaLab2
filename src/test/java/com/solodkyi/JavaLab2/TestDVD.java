package com.solodkyi.JavaLab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.solodkyi.JavaLab2.Library.DVD;
public class TestDVD 
{
	DVD dvd;
	
	@BeforeEach
	void Setup() 
	{
		dvd = new DVD("TestTitle", "TestID", 10);
	}
	@Test
	void testDVDIsEqual()
	{
		DVD dvd2 = dvd;
		assertTrue(dvd.equals(dvd2));
	}
	@Test
	void testDVDIsUnequal() 
	{
		DVD dvd2 = new DVD("TestTitle", "TestID", 11);
		assertFalse(dvd.equals(dvd2));
	}
	@Test
	void testIncorrectDuration() 
	{
		assertThrows
		(
				IllegalArgumentException.class, 
				() -> 
				{
					new DVD("TestTitle", "TestID", -1);
				}
		);
	}
}
