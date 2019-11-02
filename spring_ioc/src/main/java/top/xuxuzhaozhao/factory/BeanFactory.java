package top.xuxuzhaozhao.factory;

import top.xuxuzhaozhao.service.IAccountService;
import top.xuxuzhaozhao.service.impl.AccountServiceImpl;

public class BeanFactory {
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
