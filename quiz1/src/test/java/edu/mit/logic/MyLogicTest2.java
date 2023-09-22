package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTest2 {


	MyLogic2 myl2 = new MyLogic2();
	
	@Test
	public void testAddUp() {
		log.info(myl2.addUp(1, 2));
	}
	
	@Test
	public void testevenAddUp() {
		log.info(myl2.evenAddUp(1, 2));
	}
}
