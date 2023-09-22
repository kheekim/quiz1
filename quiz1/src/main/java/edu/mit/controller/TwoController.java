package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import edu.mit.service.QuizService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/quiz/**")
public class TwoController {
		
		private QuizService service;
	
		@GetMapping("/quiz2")
		public void numberGet() {
		
		}
		

		
		@PostMapping("/quiz2")
		public String numberpost(TwoVO vo) {
			log.info("수집된 내용:"+vo);
			service.number(vo);
			
			return "/quiz/result";
		
		}
		
		
}
