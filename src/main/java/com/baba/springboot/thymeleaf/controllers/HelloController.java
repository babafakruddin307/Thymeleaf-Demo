package com.baba.springboot.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baba.springboot.thymeleaf.model.Student;

@Controller
public class HelloController {
	@RequestMapping("/baba")
    public String Hello() {
    	return "baba";	
    }
	
	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mav=new ModelAndView("data");
		mav.addObject("message", "Do your duty 100%");
		return mav;
	}
	
	@RequestMapping("/student")
	public ModelAndView getstudent() {
		ModelAndView mov = new ModelAndView("student");
		Student st=new Student();
		st.setName("robo");
		st.setScore(100);
		mov.addObject("student",st);
		 
		 return mov;
	}
	
	@RequestMapping("/students")
	public ModelAndView getstudents() {
		ModelAndView mov = new ModelAndView("studentList");
		Student st=new Student();
		st.setName("robo");
		st.setScore(100);
		
		Student st1=new Student();
		st1.setName("anil");
		st1.setScore(90);
		
		List<Student> students=Arrays.asList(st,st1);
		mov.addObject("students",students);
		 
		 return mov;
	}
	
	@RequestMapping("/studentForm")
	public ModelAndView displaystudentForm() {
		ModelAndView mov = new ModelAndView("studentForm");
		Student st=new Student();
		st.setName("robo");
		st.setScore(100);
		mov.addObject("student",st);
		 return mov;
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mov = new ModelAndView("result");
		System.out.println(student.getName());
		System.out.println(student.getScore());
		 return mov;
	}
}
