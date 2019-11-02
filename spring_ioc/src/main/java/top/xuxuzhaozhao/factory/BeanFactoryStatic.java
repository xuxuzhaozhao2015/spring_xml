package top.xuxuzhaozhao.factory;

import top.xuxuzhaozhao.service.IAccountService;
import top.xuxuzhaozhao.service.impl.AccountServiceImpl;

public class BeanFactoryStatic {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
