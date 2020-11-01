package cn.peng.demo.dao;

import cn.peng.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {
    /**
     * 1 新建订单
     * @param order
     * @return
     */
    int create(Order order);

}
