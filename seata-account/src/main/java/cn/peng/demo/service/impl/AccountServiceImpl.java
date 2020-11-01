package cn.peng.demo.service.impl;

import cn.peng.demo.dao.AccountDao;
import cn.peng.demo.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(String userId, Integer money) {
        log.info("*******->account-service中扣减账户余额开始");

        // 模拟异常
        int i = 10 / 0;

        accountDao.decrease(userId, money);
        log.info("*******->account-service中扣减账户余额结束");
    }
}
