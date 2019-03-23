package com.spx0315.controller;

import com.spx0315.pojo.User;
import com.spx0315.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll(){
        return userService.getUser();
    }
}
