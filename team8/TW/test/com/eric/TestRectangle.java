package com.eric;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void dimensionShouldBeGreaterThanZero() {
		Rectangle rec = new Rectangle(10, 20);
		assertTrue(rec.getLength() > 0);
		assertTrue(rec.getBreadth() > 0);
	}

	@Test
	public void areaShouldBeLengthXBreadth() {
		Rectangle rec = new Rectangle(10, 20);
		assertEquals(rec.getArea(), rec.getLength() * rec.getBreadth());
	}

}
