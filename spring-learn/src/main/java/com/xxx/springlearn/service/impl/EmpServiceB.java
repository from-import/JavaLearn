package com.xxx.springlearn.service.impl;

import com.xxx.springlearn.dao.EmpDao;
import com.xxx.springlearn.pojo.Emp;
import com.xxx.springlearn.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 将当前类交给IOC管理，成为IOC中的bean
public class EmpServiceB implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        // 1. 调用Dao获取数据
        List<Emp> empList = empDao.listEmp();

        // 2.数据转换处理
        empList.stream().forEach(emp ->{

            // 1.处理gender 1.男 2.女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男人");
            } else if ("2".equals(gender)) {
                emp.setGender("女人");
            }

            // 2.处理job
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
