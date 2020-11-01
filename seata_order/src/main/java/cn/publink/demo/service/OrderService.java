package cn.publink.demo.service;


import cn.publink.demo.entity.Order;

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}