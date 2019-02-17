package com;




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
/*
*
* 传统Dao模式
* */
/*
public class test {
    private InputStream is ;
    SqlSessionFactory factory;
    SqlSession session ;
    @Before
    public void init() throws Exception {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
            //SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
            // SqlSession session = factory.openSession();
            factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();
            }
            @After
            public void destroy() throws IOException {
                session.close();
                is.close();
            }

    @Test
    */
/*
     * 查询所有
     *//*

    public void findAll() throws Exception {
        //SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
        List<Student> list = session.selectList("one.findAll");
        System.out.println(list);

        }

    @Test
    */
/*
     * 根据id查询
     * *//*
 public void findById() throws IOException {
         Student stu = session.selectOne("one.findById", 2);
        System.out.println(stu);

    }
    */
/*
    * 根据id删除
    * *//*

    @Test
    public  void deleteById() throws IOException {
        session.commit();
        Student  stu = session.selectOne("one.deleteById",1);
        System.out.println(stu);

    }



}

*/
