package tutorial2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class Unit5Test {
	@Test
	public void testUnit5_Person() {
		Unit5  = new Unit5("AliuAde A Adedigba", 42, 173, 82, "Black", "MALE");
		Logger l = Logger.getLogger(Unit5.class.getName());
		l.info("Name: " + p.getName());
		l.info("Age:" + p.getAge());
		l.info("Height (cm):" + p.getHeight());
		l.info("Weight (kg):" + p.getWeight()); 
		l.info("Eye Color:" + p.getEyeColor());
		l.info("Gender:" + p.getGender());
		assertEquals("Joe Q Author", p.getName());
		assertEquals(23, p.getAge());
		assertEquals(173, p.getHeight());
		assertEquals(69, p.getWeight()); 
		assertEquals("Black", p.getEyeColor());
		assertEquals("MALE", p.getGender());
}
}
