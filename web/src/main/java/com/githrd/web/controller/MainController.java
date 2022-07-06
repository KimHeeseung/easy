package com.githrd.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
	
	@RequestMapping({"/", "/main.esy"})
	public ModelAndView getMain(ModelAndView mv, HttpSession session, RedirectView rv) {
		if(session.getAttribute("SID") != null) {
			mv.setViewName("main");
		} else {
			rv.setUrl("/web/member/loginForm.esy");
			mv.setView(rv);
		}
		return mv;
	}
	
	@RequestMapping("/mainMsgCheck.esy")
	@ResponseBody
	public Map<String, String> msgCheck(HttpSession session){
		HashMap<String, String> map = new HashMap<String, String>();
		
		session.setAttribute("MSG_CHECK", "NO");
		
		map.put("result", "OK");
		return map;
	}
}