package top.xuxuzhaozhao.service.impl;

import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.factory.BeanFactory;
import top.xuxuzhaozhao.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public int i;

    public void saveAccount(){
        accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
        accountDao.saveAccount();
        i++;
        System.out.println(i);
    }
}
