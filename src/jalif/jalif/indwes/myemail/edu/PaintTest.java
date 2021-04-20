package jalif.jalif.indwes.myemail.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import jalif.mariano.shapes.Circle;
import jalif.mariano.shapes.Line;
import jalif.mariano.shapes.Rectangle;

class PaintTest {

	@Test
	void test1() {
		Canvas c = new Canvas();
		Rectangle r = new Rectangle(10, 10, 10, 10, 5, Color.blue, true);
		Circle circle = new Circle(10,10,10,10,5, Color.black,false);
		Line line = new Line(10,10,10,10,5,Color.pink);
		c.addShape(line);
		c.addShape(circle);
		c.addShape(r);
		
		assertEquals(c.numberOfShapes(),3);
	}
	
	void test2(){
		Canvas c = new Canvas();
		try {
			c.undo();
			fail("Did not throw exception.");
		}catch(IndexOutOfBoundsException exception) {
			System.out.println("Exception caught. Test passed.");
		}
	}
	
	void test3() {
		Canvas.setColorSelection(Color.pink);
		assertEquals(Canvas.getColorSelection(),Color.pink);
	}
	
	void test4() {
		Canvas.setIsFilled(false);
		assertEquals(Canvas.getIsFilled(),false);
	}
	
	void test5() {
		Canvas.setShapeSelection("rectangle");
		assertEquals(Canvas.getShapeSelection(),"rectangle");
	}
}
