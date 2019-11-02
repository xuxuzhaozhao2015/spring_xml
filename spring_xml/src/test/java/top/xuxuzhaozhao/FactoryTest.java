package top.xuxuzhaozhao;

import org.junit.Test;
import top.xuxuzhaozhao.factory.BeanFactory;
import top.xuxuzhaozhao.service.IAccountService;
import top.xuxuzhaozhao.service.impl.AccountServiceImpl;

public class FactoryTest {
    /**
     * 解释IOC
     * 程序直接去联系资源（IAccountService service_no_ioc = new AccountServiceImpl();）产生耦合
     *
     * IOC 控制反转：将创建对象的权利交给框架，包括DI和DL（Dependecy LookUp依赖查找）
     * 作用：降低程序间的耦合
     */
    @Test
    public void TestCoupllingFactory() {
        for (int i = 0; i <5; i++) {
            IAccountService service_no_ioc = new AccountServiceImpl();
            IAccountService service_ioc = (IAccountService)BeanFactory.getBean("accountService");
            service_ioc.saveAccount();
            System.out.println(service_ioc);
        }
    }
}
