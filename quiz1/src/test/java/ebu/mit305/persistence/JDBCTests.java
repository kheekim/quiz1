package ebu.mit305.persistence;

import static org.junit.Assert.fail;

import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	@Test
	public void testConncetion() throws Exception {
		
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://@127.0.0.1:3306/mit","aaa","1234");
		log.info("접속성공");
			
			
		
		
		
		

	}
}
