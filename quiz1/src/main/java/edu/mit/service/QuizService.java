package edu.mit.service;



import org.springframework.stereotype.Service;


import edu.mit.dao.QuizMapper;
import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Service
@Log4j
public class QuizService {
	
	
	private MyLogic3 myl3;
	
	public int allsum(TwoVO vo) {
		return myl3.addUp(vo.getNum1(), vo.getNum2());
		
	}
	
	private QuizMapper quizmapper;
	
	public void number(TwoVO vo) {
		log.info("등록 서비스 요청..");
		quizmapper.number(vo);
	}

}
