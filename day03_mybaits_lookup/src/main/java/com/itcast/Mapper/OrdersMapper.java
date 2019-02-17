package com.itcast.Mapper;

import com.itcast.daomain.Orders;

import java.util.List;

public interface OrdersMapper {
    public List<Orders>findAllByUser();
}
