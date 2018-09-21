package tutorial2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
public class Unit7_Test {
	@Test
	public void testGetfullName() {
		
			Unit7_String p = new Unit7_String("Aliu", "Adedigba", "AliuAde");
			
				Logger l = Logger.getLogger(Unit7_String.class.getName());
			
					l.info("Full Name : " + p.getFirstName()+"  " + p.getLastName()+"  "+ p.getNickName());
			
			
		
		
	}
}
