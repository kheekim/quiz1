package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogicTest {
	

	
	@Test
	public void testAddUp() {
		log.info(MyLogic.addUp(1, 10));
	}
	
	@Test
	public void testevenAddUp() {
		log.info(MyLogic.evenAddUp(1, 10));
	}
	
}
