package edu.mit.service;



import org.springframework.stereotype.Service;

import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class QuizService {
	
	
	private MyLogic3 myl3;
	
	public int allsum(TwoVO vo) {
		return myl3.addUp(vo.getNum1(), vo.getNum2());
		
	}

}
