package jalif.jalif.indwes.myemail.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import jalif.mariano.shapes.Rectangle;

class PaintTest {

	@Test
	void test1() {
		Canvas c = new Canvas();
		Rectangle r = new Rectangle(10, 10, 10, 10, Color.blue, true);
		c.getShapes().add(r);
	
	}
	
	void test2(){
		
	}

}
