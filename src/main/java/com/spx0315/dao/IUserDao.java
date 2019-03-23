package com.spx0315.dao;

import com.spx0315.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    List<User> getAllUser();
}
