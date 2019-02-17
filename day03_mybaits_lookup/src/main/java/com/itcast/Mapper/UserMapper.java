package com.itcast.Mapper;

import com.itcast.daomain.User;

import java.util.List;

public interface UserMapper {
    /*
    * 查询所有
    * */
    public List<User> findAll();

    public List<User>findAllAndItemsAndUser();




}
