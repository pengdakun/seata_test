package cn.peng.demo.controller;

import cn.peng.demo.entity.CommonResult;
import cn.peng.demo.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     * @return
     */
    @PostMapping(value = "storage/decrease")
    public CommonResult decrease(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count) {
        storageService.decrease(commodityCode, count);
        return new CommonResult(200, "扣减库存成功");
    }
}
