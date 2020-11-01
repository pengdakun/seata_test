package cn.publink.demo.service;

public interface StorageService {
    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     * @return
     */
    void decrease(String commodityCode, Integer count);
}
