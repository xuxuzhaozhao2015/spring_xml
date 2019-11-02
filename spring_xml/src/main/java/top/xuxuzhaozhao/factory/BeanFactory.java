package top.xuxuzhaozhao.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 创建Bean对象的工厂类（创建service与dao对象）
 * Bean：在计算机英语中，可重用组件的含义
 * JavaBean：用Java语言编写的可重用组件
 */
public class BeanFactory {
    //1、需要一个配置文件来配置service和dao
    //   配置的内容：唯一标识=全限定类名 （key,value）

    private static Properties props;

    // 定义一个可以存储实例的容器
    private static Map<String, Object> beans;

    // 使用静态代码块来初始化对象
    static {
        try {
            props = new Properties();
            //获取props对象的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);

            //实例化容器Map
            beans = new HashMap<String, Object>();

            //取出配置文件所有的keys
            Enumeration keys = props.keys();

            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object bean = Class.forName(beanPath).newInstance();

                beans.put(key,bean);
            }

        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化配置文件出错。");
        }
    }

    //2、通过读取配置文件根据类的名称来反射创建对象
    public static Object getBean(String beanName) {
        Object bean = null;
        try {
            bean = beans.get(beanName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
