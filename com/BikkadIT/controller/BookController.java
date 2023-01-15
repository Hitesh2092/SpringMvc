package com.BikkadIT.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.entity.Book;

@Controller
public class BookController {
	@GetMapping("/Bookname")
	public String getbook(Model model) {
		Book b=new Book();
		b.setBookId(101);
		b.setBookname("java");
		b.setBookprice(400.50);
		model.addAttribute("book", b);
		return "bookData";
	}
	
	@GetMapping("/gettingallbooks")
	public ModelAndView getAllBooks() {
		
		Book b=new Book();
		b.setBookId(101);
		b.setBookname("Python");
		b.setBookprice(500.00);
		
		Book b1=new Book();
		b1.setBookId(102);
		b1.setBookname("C");
		b1.setBookprice(300.123);
		
		Book b2=new Book();
		b2.setBookId(103);
		b2.setBookname("C++");
		b2.setBookprice(400.213);
		
		Book b3=new Book();
		b3.setBookId(104);
		b3.setBookname("Machine Learning");
		b3.setBookprice(500.650);
		
		ArrayList al=new ArrayList();
		al.add(b);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		ModelAndView mav=new ModelAndView();
		mav.addObject("BookList", al);
		mav.setViewName("book");
		return mav ;
		
	}
	
	

}
