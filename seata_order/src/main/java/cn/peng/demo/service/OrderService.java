package cn.peng.demo.service;


import cn.peng.demo.entity.Order;

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}