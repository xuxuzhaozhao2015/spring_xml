package top.xuxuzhaozhao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xuxuzhaozhao.service.IAccountService;

public class SpringTest {
    ApplicationContext ac;
    IAccountService as;

    @Before
    public void Init() {
        ac = new ClassPathXmlApplicationContext("bean.xml");
    }

    @Test
    public void TestSetDI() {
        as = ac.getBean("accountService_set", IAccountService.class);

        System.out.println(as);
    }

    @Test
    public void TestSetComplicate(){
        as = ac.getBean("accountService_set_complicate",IAccountService.class);
        System.out.println(as);
    }
}
