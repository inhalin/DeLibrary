package com.example.demo.db;

import com.example.demo.vo.BookVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;


public class NewbooksManager {
    public static SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "com/example/demo/db/sqlMapConfig.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            System.out.print("예외발생:" + e.getMessage());
        }
    }

    //목록
    public static List<BookVO> findAll() {
        List<BookVO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
        list = session.selectList("newbooks.selectAll");
        session.close();
        return list;
    }

}

