package com.zqb.system.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.zqb.common.base.BaseEntity;
import com.zqb.common.enums.OnlineStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 当前在线会话 sys_user_online
 *
 * @author ruoyi
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserOnline extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 用户会话id
     */
    @TableId("sessionId")
    private String sessionId;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 登录IP地址
     */
    private String ipAddr;

    /**
     * 登录地点
     */
    private String loginLocation;

    /**
     * 浏览器类型
     */
    private String browser;

    /**
     * 操作系统
     */
    private String os;



    /**
     * session创建时间
     */
    private Date startTimestamp;

    /**
     * session最后访问时间
     */
    private Date lastAccessTime;

    /**
     * 超时时间，单位为分钟
     */
    private Long expireTime;
    /**
     * 在线状态
     */
    private OnlineStatus status = OnlineStatus.on_line;



    public OnlineStatus getStatus()
    {
        return status;
    }

    public void setStatus(OnlineStatus status)
    {
        this.status = status;
    }


}
