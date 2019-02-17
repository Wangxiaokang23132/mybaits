package com.itcast.Mapper;

import com.itcast.daomain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    /*
     * 查询所有
     * */
    @Select("select * from student")
    public List<Student> findAll();
    /*
     * 根据id查询
     * */
    public Student findById(int id);
    /*
     * 根据id删除
     * */
    public void deleteById(int id);

    /*
    * 保存数据
    * */
    public  void save();
}
