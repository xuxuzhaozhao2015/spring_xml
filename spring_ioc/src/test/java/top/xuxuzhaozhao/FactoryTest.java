package top.xuxuzhaozhao;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.service.IAccountService;

public class FactoryTest {
    /**
     * spring核心容器，根据id获取对象
     * ApplicationContext的常用三个实现类
     * ClassPathXmlApplicationContext ：常用，类路径加载器
     * FileSystemXmlApplicationContext ：加载磁盘任一路径的xml配置
     * AnnotationConfigApplicationContext ：基于注解的
     */
    @Test
    public void TestCoupllingFactory() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        // 根据id获取bean对象
        IAccountDao ad = ac.getBean("accountDao", IAccountDao.class);
        IAccountService as = (IAccountService) ac.getBean("accountService");

        ad.saveAccount();
        System.out.println(ad);
        as.saveAccount();
        System.out.println(as);
    }
}
