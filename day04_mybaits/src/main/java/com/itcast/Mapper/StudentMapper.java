package com.itcast.Mapper;

import com.itcast.daomain.Student;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

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
    @Select("select * from student where id=#{id}")
/*    @Results(id ="UserMap",value = {
            @Result(id=true,column ="id",property = "id"),
            @Result(property = "user",javaType = BIConversion.User.class,column ="user_id",
            one = @One(select = com.itcast.Mapper.StudentMapper.findAll(),fetchType = FetchType.DEFAULT))
    })*/
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
