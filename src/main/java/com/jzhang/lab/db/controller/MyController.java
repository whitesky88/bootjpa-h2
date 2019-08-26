package com.jzhang.lab.db.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jzhang.lab.db.dao.MyDataRepo;
import com.jzhang.lab.db.data.MyData;

@Controller
public class MyController {

	@Autowired
	MyDataRepo repo;

// start of lab1
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
	
// start of lab2	
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
	
// start of lab3	
		@RequestMapping("lab3")
		public ModelAndView runlab3() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("lab3");
			return mv;
		}
			
		@RequestMapping("lab3/create")
		public ModelAndView lab3create(MyData d) {
			ModelAndView mv = new ModelAndView();
			MyData tmp;
			
			mv.setViewName("lab3/create");
			if ( d == null ) return mv;
			
			tmp = repo.findById((Integer) d.getId()).orElse(null);
			
			if( tmp != null ) return mv;
			
			System.out.println(d.toString());
			repo.save(d);
			mv.addObject("obj", d);
			return mv;
		}
		
		@RequestMapping("lab3/update")
		public ModelAndView lab3update(MyData d) {
			ModelAndView mv = new ModelAndView();
			MyData tmp;
			
			mv.setViewName("lab3/update");
			if ( d == null ) return mv;
			tmp = repo.findById((Integer)d.getId()).orElse(null);
			
			if ( tmp == null ) return mv;
			
			repo.save(d);
			mv.addObject("obj", d);
			return mv;
		}

		@RequestMapping("lab3/delete")
		public ModelAndView lab3delete() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("lab3");
			return mv;
		}
		
		@RequestMapping("lab3/delete/{id}") 
		public ModelAndView lab3delete1(@PathVariable("id") int id) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("lab3");
			
			MyData tmp;
			tmp = repo.findById( (Integer) id).orElse(null);
			if ( tmp == null ) return mv;
			
			repo.delete(tmp);
						
			return mv;
		}
			

		@RequestMapping("lab3/list")
		@ResponseBody
		public Iterable<MyData> lab3list() {
			return repo.findAll();
		}

		
		@RequestMapping("lab3/list/{id}")
		public ModelAndView lab3list1(@PathVariable("id") int id) {
			System.out.println("entering");
			ModelAndView mv = new ModelAndView();
			mv.setViewName("lab3/list");
						
			MyData d = repo.findById((Integer)id).orElse(null);
			if ( d == null ) return mv;
			
			mv.addObject("obj", d);
			return mv;
		}

}
