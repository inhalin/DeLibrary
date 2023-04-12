package com.example.demo.db;

import com.example.demo.vo.FolderVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;


public class FolderManager {

    public static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "com/example/demo/db/sqlMapConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            System.out.println("?��?��발생:" + e.getMessage());
        }
    }


    public static List<FolderVO> findByNo(HashMap map) {
        List<FolderVO> f = null;
        SqlSession session
                = sqlSessionFactory.openSession();
        f = session.selectList("folder.selectByNo", map);
        session.close();
        return f;
    }

    public static int pageByfolder(int cust_no) {
        int n = -1;
        SqlSession session = sqlSessionFactory.openSession();
        n = session.selectOne("folder.pageByfolder", cust_no);
        session.close();
        return n;
    }

}