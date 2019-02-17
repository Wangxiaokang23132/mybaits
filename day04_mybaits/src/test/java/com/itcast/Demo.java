package com.itcast;

import com.itcast.Mapper.StudentMapper;
import com.itcast.daomain.Student;
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

public class Demo {
    InputStream is;
    SqlSessionFactory factory;
    SqlSession session;
    StudentMapper mapper;
    @Before
    public void init() throws IOException {
         is = Resources.getResourceAsStream("SqlMapConfig.xml");
         factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        mapper = session.getMapper(StudentMapper.class);
    }
    @After
    public  void destroy() throws IOException {
        session.commit();
        session.close();
        is.close();
        }
    /*
 * 查询所有
 * **/
 @Test
    public void  findAll() throws IOException {
     List<Student> list = mapper.findAll();
     for (Student student : list) {
         System.out.println(student.getName()+student.getAge()+student.getSex());
     }
     }
     /*
     * 根据id查询
     * */
     @Test
 public void findAllById() throws IOException {
    InputStream is =Resources.getResourceAsStream("SqlMapConfig.xml");
         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
         SqlSession session = factory.openSession();
         StudentMapper mapper = session.getMapper(StudentMapper.class);
         Student id = mapper.findById(4);
         System.out.println(id);
     }

}
