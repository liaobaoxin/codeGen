package com.zqb.web.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zqb.system.domain.SysOperLog;
import com.zqb.system.domain.User;
import com.zqb.system.service.ISysOperLogService;
import com.zqb.system.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Controller
public class TestController {

    @Autowired
    DataSource dataSource;

    @Autowired
    IUserService userService;

    @Autowired
    ISysOperLogService sysOperLogService;

    @RequestMapping("/test")
    public void test1() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("=11=" + connection);
    }

    @RequestMapping("/test1")
    @ResponseBody
    public List<User> test2() {
//        List<User> users = userService.selectList(null);
        List<User> users = userService.list();
        return users;
    }

    @RequestMapping("/test3")
    @ResponseBody
    public SysOperLog test3() {
//        List<User> users = userService.selectList(null);
        QueryWrapper<SysOperLog> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(SysOperLog::getTitle, "代码生成");
        SysOperLog operLog = sysOperLogService.getOne(wrapper);
        return operLog;
    }
}
