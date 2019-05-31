package com.zqb.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zqb.system.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService extends IService<User> {
    void sayHi();
}
