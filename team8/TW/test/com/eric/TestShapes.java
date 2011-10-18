package com.eric;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShapes {

	@Test
	public void rectangleDimensionShouldBeGreaterThanZero() {
		Rectangle rec = new Rectangle(10, 20);
		assertTrue(rec.getLength() > 0);
		assertTrue(rec.getBreadth() > 0);
	}

	@Test
	public void rectangleAreaShouldBeLengthXBreadth() {
		Rectangle rec = new Rectangle(10, 20);
		assertEquals(rec.getArea(), rec.getLength() * rec.getBreadth());
	}

	@Test
	public void circleRadiusShouldBeGreaterThanZero() {
		Circle cir = new Circle(10);
		assertTrue(cir.getRadius() > 0);
	}
}
