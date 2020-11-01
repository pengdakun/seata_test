package cn.peng.demo.service.impl;

import cn.peng.demo.dao.StorageDao;
import cn.peng.demo.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     * @return
     */
    @Override
    public void decrease(String commodityCode, Integer count) {
        storageDao.decrease(commodityCode, count);
    }
}
