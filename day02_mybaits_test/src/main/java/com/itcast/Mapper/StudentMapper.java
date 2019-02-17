package com.itcast.Mapper;

import com.itcast.daomain.Student;

import java.util.List;

public interface StudentMapper {
    /*
     * 查询所有
     * */
    public List<Student> findAll();
    /*
     * 根据id查询
     * */
    public Student findById(int id);
    /*
     * 根据id删除
     * */
    public void deleteById(int id);

}
