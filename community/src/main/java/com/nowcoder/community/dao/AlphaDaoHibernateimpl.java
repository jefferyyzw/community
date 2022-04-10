package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author yzw
 * @version 1.0
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateimpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }

}
