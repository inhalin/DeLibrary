package com.example.demo.dao;

import com.example.demo.db.BooklistManager;
import com.example.demo.vo.BookVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BooklistDAO {
    // 사서추천도서 목록
    public List<BookVO> findAllRecom() {
        return BooklistManager.findAllRecom();
    }

    // 이달의 인기도서 목록
    public static List<BookVO> getPopBook() {
        return BooklistManager.getPopBook();
    }

    // 신착도서
    public List<BookVO> findAllNew() {
        return BooklistManager.findAllNew();
    }
}

