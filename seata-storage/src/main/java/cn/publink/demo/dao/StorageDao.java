package cn.publink.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    /**
     * 减库存
     * @param commodityCode
     * @param count
     * @return
     */
    int decrease(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
