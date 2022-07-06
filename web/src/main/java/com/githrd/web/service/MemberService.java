package com.githrd.web.service;

import java.lang.reflect.Method;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.githrd.web.dao.*;
import com.githrd.web.vo.*;

@Service // service 클래스를 빈등록해주는 어노테이션
@Aspect
public class MemberService {
//	private static Logger loginLog = LoggerFactory.getLogger("memberLog");
	private static Logger loginLog = LoggerFactory.getLogger("memberLog2");
	
	/*
	 * @Pointcut("execution(* com.githrd.web.controller.Member.loginProc(..))")
	 * public void recordLogin() {
	 * System.out.println("##########  aop start #############"); }
	 */
	@After("execution(* com.githrd.web.controller.Member.login(..))")
	public boolean rec(JoinPoint join) {
		MemberVO mVO = (MemberVO) join.getArgs()[0];
		
		if(mVO.getCnt() == 1) {
			loginLog.info(mVO.getId() + " 님 로그인");
		}
		return true;
	}
}