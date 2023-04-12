package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVO {
    private int cust_no;
    private String email;
    private String pw;
    private String addr;
    private String addr2;
    private String nickname;
    private String interest;
    private String name;
    private String m_phone;
    private String fname;
    private Date birthday;
    private String manager;
    private MultipartFile uploadFile;
}

