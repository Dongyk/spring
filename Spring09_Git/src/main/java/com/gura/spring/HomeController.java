package com.gura.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//컨트롤러로 만들기 위한 어노테이션
@Controller
public class HomeController {
	
	//home.do 요청 처리
	@RequestMapping("/home") // 클라이언트의 요청 맵핑하기 위한 어노테이션
	public String home() {
		/*
		 *  리턴되는 data type 과 메소드명은 상황에 맞게 구성할수 있다.
		 *  
		 *  - 리턴 Type 을 String 으로 한다는 것의 의미
		 *    단, @ReponseBody 어노테이션이 없다는 가정 하에서
		 *    
		 *    1. forward 이동 정보를 리턴해준다.
		 *    2. redirect 이동 정보를 리턴해준다.
		 *    	"redirect:/home.do(요청경로)"
		 */
		
		return "/home"; // /WEB-INF/views/home.jsp (forward)
	}
	
}



















