package com.xxx.springlearn.controller;


import com.xxx.springlearn.pojo.Address;
import com.xxx.springlearn.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public Result hello(){
        return Result.success("hello");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address("hi","beijing");
        return Result.success(addr);
    }


    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("hi","beijing"));
        addresses.add(new Address("test","shanghai"));
        return Result.success(addresses);
    }
}
