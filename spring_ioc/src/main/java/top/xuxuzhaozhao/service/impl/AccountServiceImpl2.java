package top.xuxuzhaozhao.service.impl;

import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.service.IAccountService;

import java.util.*;

public class AccountServiceImpl2 implements IAccountService {
    private String name;
    private Integer age;
    private Date birthday;

    //复杂类型注入
    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySets;
    private Map<String,String> myMaps;
    private Properties myProps;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySets(Set<String> mySets) {
        this.mySets = mySets;
    }

    public void setMyMaps(Map<String, String> myMaps) {
        this.myMaps = myMaps;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    private IAccountDao accountDao;

    public void saveAccount() {}

    @Override
    public String toString() {
        return "AccountServiceImpl2{" +
                "myStrs=" + Arrays.toString(myStrs) +
                ", myList=" + myList +
                ", mySets=" + mySets +
                ", myMaps=" + myMaps +
                ", myProps=" + myProps +
                ", accountDao=" + accountDao +
                '}';
    }
}
