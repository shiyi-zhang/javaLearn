package org.zsy.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBTools {

    public static SqlSessionFactory SessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis.cfg.xml");
            SessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        return SessionFactory.openSession();
    }

}
