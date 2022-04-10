package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author yzw
 * @version 1.0
 */
@Repository
@Primary
public class AlphaDaoMyBatisimpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
