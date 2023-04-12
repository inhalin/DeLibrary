package com.example.demo.dao;


import com.example.demo.db.BookManager;
import com.example.demo.vo.BookstoreVO;
import org.springframework.stereotype.Repository;

@Repository
public class BookStoreDAO {
    public BookstoreVO findByNo() {
        return BookManager.findByNo2();
    }
}
