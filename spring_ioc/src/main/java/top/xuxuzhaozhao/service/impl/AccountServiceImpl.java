package top.xuxuzhaozhao.service.impl;

import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.dao.impl.AccountDao;
import top.xuxuzhaozhao.service.IAccountService;

import java.util.Date;

public class AccountServiceImpl implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    private IAccountDao accountDao;

    public AccountServiceImpl() {}

    // 经常变化的数据不适用构造函数注入
    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    // 构造函数注入
    public AccountServiceImpl(IAccountDao accountDao) {
        this.accountDao = accountDao;

        System.out.println("方法执行了");
    }

    public void saveAccount() {
        accountDao = new AccountDao();
        accountDao.saveAccount();
    }

    //使用spring时，xml中指定时间段自动执行的方法
    public void init() {
    }

    public void destroy() {
    }
}
