package com.shapes.test;
import static org.junit.Assert.assertEquals;

import com.shapes.*;
import com.shapes.interfaces.Shape;
import org.junit.*;


public class TestCircle {
	Circle s = new Circle();
	@Test
	public void testDraw()
	{
		s.setRadius(10.0);
		s.draw();
		assertEquals(314.0,s.draw());
		
	}

}
