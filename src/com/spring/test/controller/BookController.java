package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.test.service.BookService;


// BookController는  IOC Container에 저장이 되어있음.

@Controller
@RequestMapping("book")
public class BookController {

	
	// Bean으로 등록이 되어있어야 사용이 가능하다 그렇지 않으면 직접 new 키워드를 사용해서 객체를 생성해야함.
	// @Autowired를 명시해주면 BookService Bean을 자동으로 주입해준다. -> BookController 클래스 내부에서 사용이 가능해짐
	@Autowired
	private BookService bookService;
	
//	public BookController() {
//		bookService = new BookService();
//	}
	
//	public void setBookService(BookService bookService) {
//		this.bookService = bookService;
//	}

	@RequestMapping("test")
	public String returnHelloSpring(@RequestParam(name = "book_no") int bookNo) {
//		System.out.println(bookNo);
		String book = bookService.getBookByBookNo(bookNo);
		System.out.println(book);
		
		return "/WEB-INF/views/hello.jsp";
	}
	
}
