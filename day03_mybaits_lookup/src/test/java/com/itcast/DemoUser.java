package com.itcast;



import com.itcast.Mapper.UserMapper;

import com.itcast.daomain.Orders;
import com.itcast.daomain.User;
import com.itcast.daomain.items;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class DemoUser {
    private static UserMapper mapper;
    private static SqlSession session;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();
            mapper = session.getMapper(UserMapper.class);

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
        List<User> list = mapper.findAll();
            for (User user : list) {
                List<Orders> orders = user.getOrders();
                System.out.println("姓名"+user.getUsername());
                for (Orders order : orders) {
                    System.out.println("编号"+order.getNumber());

                }

        }


    }
    @Test
    public  void test(){
        List<User> userList = mapper.findAllAndItemsAndUser();
        for (User user : userList) {
            System.out.println("姓名:"+user.getUsername());
            List<Orders> orders = user.getOrders();
            for (Orders order : orders) {
                System.out.println("编号:"+order.getNumber());
                List<items> items = order.getItems();
                for (items item : items) {
                    System.out.println("商品名字:"+item.getName()+"商品价格:"+item.getPrice());

                }
            }
        }
    }
}
