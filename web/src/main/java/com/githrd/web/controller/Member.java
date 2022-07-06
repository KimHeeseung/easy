package com.githrd.web.controller;



import java.util.*;







import javax.servlet.http.*;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.view.*;

import com.githrd.web.dao.*;
import com.githrd.web.vo.*;

@Controller
@RequestMapping("/member")
public class Member {
	

	@Autowired
	MemberDao mDao;
	
	@RequestMapping("/login.esy")
	@ResponseBody
	public Map<String, String> login(MemberVO mVO,HttpSession session){
		HashMap<String, String> map = new HashMap<String, String>();
		String result = "NO";
		
		int cnt = mDao.getLogin(mVO);
		mVO.setCnt(cnt);
		if(cnt == 1) {
			result = "OK";
			session.setAttribute("SID", mVO.getId());
			session.setAttribute("MSG_CHECK", "OK");
		}
		map.put("result",result);
		return map;
	}
	
	@RequestMapping(path="/loginForm.esy")
	public ModelAndView loginForm(ModelAndView mv, HttpSession session) {
		mv.setViewName("member/login");
		return mv;
	}
}