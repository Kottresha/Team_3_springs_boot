package com.ltts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ltts.HotelReservationApplication;
import com.ltts.Entity.User;
import com.ltts.repository.UserRepository;

@Controller
public class InterfaceController {
	
	@Autowired
	UserRepository register;
	
	static int value = 1;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping(value = "memberInsert", method = RequestMethod.POST)
	public String memberInsert(HttpServletRequest session) {
		
		User user = new User();
		
		user.setRegisterId(value++);
		user.setUserMailid(session.getParameter("mailId"));
		user.setUserName(session.getParameter("userName"));
		user.setMobNo(session.getParameter("mobNo"));
		user.setPassword(session.getParameter("pass"));
		user.setAddress(session.getParameter("address"));
		
		register.save(user);
		
		return "";
	}
	
}
