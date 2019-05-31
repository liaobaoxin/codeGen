package com.zqb.framework.util;

import com.zqb.framework.manager.AsyncManager;
import com.zqb.framework.manager.factory.AsyncFactory;
import com.zqb.system.domain.SysOperLog;

import java.util.TimerTask;

public class RecordUtils {

    /**
     * 异步记录日志
     * @param username
     * @param status
     * @param message
     * @param args
     */
    public static void LoginInfo(final String username, final String status, final String message, final Object... args){
        TimerTask task = AsyncFactory.recordLoginInfo(username, status, message, args);
        AsyncManager.me().execute(task);
    }

    /**
     * 记录操作日志
     */
    public static void oper(SysOperLog operLog){
        TimerTask task = AsyncFactory.recordOper(operLog);
        AsyncManager.me().execute(task);
    }


}
