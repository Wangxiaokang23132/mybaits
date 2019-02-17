package com.itcast;

import com.itcast.Mapper.StudentMapper;
import com.itcast.Mapper.UserMapper;
import com.itcast.daomain.Student;
import com.itcast.daomain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    InputStream is;
    SqlSession session;
    StudentMapper mapper;

    @Before//测试前
    public void init() throws Exception {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        mapper = session.getMapper(StudentMapper.class);
    }

    @After//测试后
    public void destroy() throws Exception {
        session.commit();
        session.close();
        is.close();
    }
    /*
    * 查询name
    * */
    @Test
    public  void findByName(){
        String []names={"aaa"};
        List<Student> name = mapper.findByName(names);
        System.out.println(name);
        }
        /*
        * 查询所有
        * */
        @Test
        public  void findAll(){
            List<Student> list = mapper.findAll("");
            System.out.println(list);

        }
        /*
        根据id查询
         */
        @Test
    public  void findById(){
            List <Student>list=new ArrayList<Student>();
            List<Student> id = mapper.findById(list);
            for (Student student : id) {
                System.out.println(student);
            }
        }
}
