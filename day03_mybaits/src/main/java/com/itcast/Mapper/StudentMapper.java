package com.itcast.Mapper;

import com.itcast.daomain.Student;
import com.itcast.daomain.User;

import java.util.List;

public interface StudentMapper {
    /*
     * 查询所有
     * */
    public List<Student> findAll(String name);
    /*
     * 根据id查询
     * */
    public List<Student> findById(List  list);
    /*
     * 根据id删除
     * */
    public void deleteById(int id);

        /*
        * 根据姓名查询数据
        * */
      public List<Student> findByName(String[] name);

}
