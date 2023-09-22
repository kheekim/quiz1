package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mit.dao.TwoVO;
import edu.mit.service.TwoService;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/quiz/**")
public class TwoController {
		
	
	
		@GetMapping("/quiz2")
		public void numberGet() {
		
		}
		
		@PostMapping("/quiz2")
		public void numberpost(TwoVO vo) {
			
			log.info(vo);
			
		
		}
}
