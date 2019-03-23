package com.spx0315.service.impl;

import com.spx0315.dao.IUserDao;
import com.spx0315.pojo.User;
import com.spx0315.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IUser")
public class UserServiceImpl implements IUserService {

    /*调用dao层*/
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> getUser() {
        return iUserDao.getAllUser();
    }
}
