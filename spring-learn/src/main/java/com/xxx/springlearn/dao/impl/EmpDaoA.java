package com.xxx.springlearn.dao.impl;

import com.xxx.springlearn.dao.EmpDao;
import com.xxx.springlearn.pojo.Emp;
import com.xxx.springlearn.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // 将当前类交给IOC管理，成为IOC中的bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 1.加载并解析xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
