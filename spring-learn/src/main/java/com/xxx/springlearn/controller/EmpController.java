package com.xxx.springlearn.controller;


import com.xxx.springlearn.pojo.Emp;
import com.xxx.springlearn.pojo.Result;
import com.xxx.springlearn.service.EmpService;
import com.xxx.springlearn.service.impl.EmpServiceA;
import com.xxx.springlearn.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired // 运行时，IOC提供该类型的bean对象，并自动赋值 -- 依赖注入

    private EmpService empService;
        @RequestMapping("listEmp")
        public Result list(){
            List<Emp> empList = empService.listEmp();
            // 3.响应数据
            return Result.success(empList);
        }


}
