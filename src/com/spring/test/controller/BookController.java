package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.test.service.BookService;


// BookController��  IOC Container�� ������ �Ǿ�����.

@Controller
@RequestMapping("book")
public class BookController {

	
	// Bean���� ����� �Ǿ��־�� ����� �����ϴ� �׷��� ������ ���� new Ű���带 ����ؼ� ��ü�� �����ؾ���.
	// @Autowired�� ������ָ� BookService Bean�� �ڵ����� �������ش�. -> BookController Ŭ���� ���ο��� ����� ��������
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
