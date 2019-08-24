package com.jzhang.lab.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jzhang.lab.db.dao.MyDataRepo;
import com.jzhang.lab.db.data.MyData;

@Controller
public class MyController {

	@Autowired
	MyDataRepo repo;
	
	@RequestMapping("lab1")
	public ModelAndView runlab1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("lab1");
		return mv;
	}
	
	@RequestMapping("AddData")
	public ModelAndView Create( MyData d) {
		ModelAndView mv = new ModelAndView();
		System.out.println(d.toString());
		repo.save(d);
		mv.setViewName("lab1");
		return mv;
	}
			
}
