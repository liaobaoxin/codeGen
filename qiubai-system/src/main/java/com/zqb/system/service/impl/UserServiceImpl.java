package com.zqb.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqb.system.domain.User;
import com.zqb.system.mapper.UserMapper;
import com.zqb.system.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public void sayHi() {
        System.out.println("你好");
    }
}
