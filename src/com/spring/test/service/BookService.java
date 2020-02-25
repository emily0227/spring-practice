package com.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.repository.BookDAO;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDAO;
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// BookContoller -> BookService -> BookDAO 
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	public String getBookByBookNo(int bookNo) {
		
		if (bookNo == 1) {
			return bookDAO.selectBookByBookNo(bookNo);
		}
		return "Hello Spring !!";
	}
	
}
