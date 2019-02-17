package com.itcast.Mapper;

import com.itcast.daomain.User;

import java.util.List;

public interface UserMapper {
    /*
    * 查询所有
    * */
    public List<User> findAll();
    /*
    * 根据id查询数据
    * */
    public User findById(int id);
    /*
    * 根据名字查询数据
    * */
    public User findByName(String name);

    /*
    * 保存数据
    * */
    public  void save(User user);

    /*
    * 模糊查询
    * */
    List<User> findLike(String name);



    /*
    * 修改数据
    * */

    public void updateUser(User user);
}
