package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MyLogicTest3 {
	
	@Autowired
	MyLogic3 myl3;
	
	@Test
	public void testAddUp() {
		log.info(myl3.addUp(1, 10));
	}
	
	@Test
	public void testevenAddUp() {
		log.info(myl3.evenAddUp(1, 2));
	}
}
