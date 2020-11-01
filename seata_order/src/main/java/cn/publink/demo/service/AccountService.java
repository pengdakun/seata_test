package cn.publink.demo.service;

import cn.publink.demo.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-account")
public interface AccountService {
    /**
     * 减余额
     *
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "account/decrease")
    CommonResult decrease(@RequestParam("userId") String userId, @RequestParam("money") Integer money);
}
