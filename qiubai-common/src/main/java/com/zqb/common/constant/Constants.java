package com.zqb.common.constant;

/**
 * 通用常量信息
 *
 * @author ruoyi
 */
public interface Constants {
    /**
     * UTF-8 字符集
     */
     String UTF8 = "UTF-8";

    /**
     * 通用成功标识
     */
     String SUCCESS = "0";

    /**
     * 通用失败标识
     */
     String FAIL = "1";

    /**
     * 登录成功
     */
     String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
     String LOGOUT = "Logout";

    /**
     * 登录失败
     */
     String LOGIN_FAIL = "Error";

    /**
     * 自动去除表前缀
     */
     String AUTO_REOMVE_PRE = "true";

    /**
     * 当前记录起始索引
     */
     String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
     String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
     String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
     String IS_ASC = "isAsc";
}
