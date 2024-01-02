package com.solodkyi.JavaLab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.solodkyi.JavaLab2.Library.Book;
public class TestBook 
{
	Book book;
	
	@BeforeEach
	void setup()
	{
		book = new Book("TestName", "TestID", "TestAuthor");
	}
	
	@Test
	void testBookIsEqual() 
	{
		Book book2 = book;
		assertTrue(book.equals(book2));
	}
	@Test
	void testBookIsUnequal() 
	{
		Book book2 = new Book("DifferentName", "DifferentID", "DifferentAuthor");
		assertTrue(!book.equals(book2));
	}
}
