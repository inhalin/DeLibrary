package com.example.demo.dao;

import com.example.demo.db.NewbooksManager;
import com.example.demo.vo.BookVO;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class NewbooksDAO {
    public List<BookVO> findAll() {
        return NewbooksManager.findAll();
    }
}
