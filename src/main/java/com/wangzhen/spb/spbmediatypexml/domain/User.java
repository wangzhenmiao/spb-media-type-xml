package com.wangzhen.spb.spbmediatypexml.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName User
 * @Description
 * @Author wangzhen
 * @Date 2018/10/28 下午3:01
 **/

@XmlRootElement //类转为xml
public class User {

    private Long id; // 实体的唯一标识

    private String name;

    private String email;

    public User() { // 无参数默认构造器
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
