package com.shapes.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.shapes.Rectangle;



public class TestRectangle {
	Rectangle rect = new Rectangle();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDraw()
	{
		
//		BufferedReader br = new BufferedReader(new InputStream(System.in)));
		rect.setLength(0);
		rect.setBreadth(0);
		
		assertEquals(0,rect.draw());
		
	}
	
	

}
