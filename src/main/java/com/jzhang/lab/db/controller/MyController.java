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
	@RequestMapping("lab2")
	public ModelAndView runlab2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("lab2");
		return mv;
	}
		
	@RequestMapping("lab2/create")
	public ModelAndView lab2create(MyData d) {
		ModelAndView mv = new ModelAndView();
		MyData tmp;
		
		mv.setViewName("lab2/create");
		if ( d == null ) return mv;
		
		tmp = repo.findById((Integer) d.getId()).orElse(null);
		
		if( tmp != null ) return mv;
		
		System.out.println(d.toString());
		repo.save(d);
		mv.addObject("obj", d);
		return mv;
	}
	
	@RequestMapping("lab2/update")
	public ModelAndView lab2update(MyData d) {
		ModelAndView mv = new ModelAndView();
		MyData tmp;
		
		mv.setViewName("lab2/update");
		if ( d == null ) return mv;
		tmp = repo.findById((Integer)d.getId()).orElse(null);
		
		if ( tmp == null ) return mv;
		
		repo.save(d);
		mv.addObject("obj", d);
		return mv;
	}

	@RequestMapping("lab2/delete") 
	public ModelAndView lab2delete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("lab2");
		return mv;
	}
		

	@RequestMapping("lab2/list")
	public ModelAndView lab2list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("lab2");
		return mv;
	}

	
	@RequestMapping("lab2/list1")
	public ModelAndView lab2list1(Integer id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("lab2/show1");
		if ( id == null ) return mv;
		
		MyData d = repo.findById(id.intValue()).orElse(new MyData());
		mv.setViewName("lab2/show1");
		mv.addObject("obj", d);
		return mv;
	}
}
