package com.itcast;

import com.itcast.Mapper.OrdersMapper;
import com.itcast.daomain.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class demo {

   private static OrdersMapper mapper;
   private static   SqlSession session;

    static {
        try {
        InputStream    is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
           session = factory.openSession();
            mapper = session.getMapper(OrdersMapper.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @After
    public void destroy(){
        session.commit();
        session.close();
    }
    @Test
    public void find(){
        List<Orders> list = mapper.findAllByUser();
        for (Orders orders : list) {
            System.out.println("订单编号"+orders.getNumber());
            System.out.println(orders.getUser().getUsername());
        }

    }
}
