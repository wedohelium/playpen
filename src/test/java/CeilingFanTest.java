package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bluecross.assessment.object.CeilingFan;

public class CeilingFanTest {
	CeilingFan cf;

	@Before
	public void setUp() throws Exception {
		cf =new CeilingFan();
	}



	@Test
	public void testGetState() {
		cf.pull();
		cf.pull();
		cf.pull();
		cf.reverse();
		cf.pull();
		cf.pull();
		
		if(cf.getSpeed()==1 && cf.getDirection().equals("COUNTER-CLOCKWISE") && cf.getState().equals("ON")) {
    		assertTrue( true );
    	}else {
    		assertTrue(false);
    	}

		
		
	}


}
