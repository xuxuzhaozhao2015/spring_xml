package top.xuxuzhaozhao.demo1;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_DEMOTest {

    /**
     * 程序的耦合
     * 程序间的依赖关系：
     * 类之间的依赖
     * 方法之间的依赖
     * 解耦：
     * 降低程序间的依赖
     * 编译期间不依赖，运行时才依赖
     * 第一步：使用反射来创建对象，而避免使用new关键字
     * 第二步：通过读取配置文件来获取要创建的对象全限定类名
     */
    @Test
    public void TestCoupling() throws Exception{
        //1、注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //2、获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis_test?useSSL=false", "root", "zywoaini1314");

        //3、获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from user;");

        //4、执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();

        //5、遍历结果集
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }

        //6、释放对象
        rs.close();
        pstm.close();
        conn.close();
    }
}
