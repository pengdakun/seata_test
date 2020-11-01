package cn.publink.demo.service;

import cn.publink.demo.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage")
public interface StorageService {
    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     * @return
     */
    @PostMapping(value = "storage/decrease")
    CommonResult decrease(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}