package com.spring.test.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	public String selectBookByBookNo(int bookNo) {
		
		if (bookNo == 1) {
			return "Book make in BookDAO";
		}
		
		return "Hello Spring !!";
	}
	
}
