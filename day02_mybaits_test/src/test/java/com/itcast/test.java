package com.itcast;

import com.itcast.Mapper.UserMapper;
import com.itcast.daomain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    InputStream is;
    SqlSession session;
    UserMapper mapper;

    @Before
    public void init() throws Exception {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory  factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void destroy() throws Exception {
        session.commit();
        session.close();
        is.close();
    }

    /*
     * 查询所有
     * */
    @Test
    public void findAll() throws Exception {
        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }

    }

    /*
     *
     * 根据id查询数据
     * */
    @Test
    public void findById() throws Exception {
        User user = mapper.findById(2);
        System.out.println(user);
    }

    /*
    根据Name属性查询数据
    */
    @Test
    public void findByName() throws IOException {
        User name = mapper.findByName("张三");
        System.out.println(name);
    }

    /*
     * 保存数据
     * */
    @Test
    public void save() throws IOException {
        User user = new User();
        user.setUsername("王五2");
        user.setUser_grander("男");
        user.setAge(23);
        user.setAddress("合肥市");
        user.setQq(123456);
        user.setUser_email("1654063643@qq.com");
        System.out.println("保存之前"+user);
        mapper.save(user);
        System.out.println("保存之后"+user);

    }

    /*
     *
     * 模糊查询
     * */
    @Test
    public void findLike() throws IOException {


        String name = "五";
        List<User> list = mapper.findLike(name);
        for (User user : list) {
            System.out.println(user);
        }
    }
    /*
    * 修改数据
    * */
    @Test
    public  void updateUser(){
      User user =new User();
      user.setId(249);
      user.setUsername("小康");
      user.setUser_grander("男");
      user.setAge(18);
      user.setAddress("合肥");
      user.setQq(132132);
      user.setUser_email("2132");
      mapper.updateUser(user);
        System.out.println(user);
    }
}
