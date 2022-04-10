package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author yzw
 * @version 1.0
 */
@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct
    public  void init() {
        System.out.println("初始化AlpahService");
    }

    @PreDestroy
    public void destory() {
        System.out.println("销毁");
    }

    public String find() {
        return alphaDao.select();
    }
}
