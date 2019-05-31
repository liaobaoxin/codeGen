package com.zqb.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 系统访问记录
 * </p>
 *
 * @author jobob
 * @since 2018-12-16
 */
@Data
@Accessors(chain = true)
public class SysLoginInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 访问ID
     */
    @TableId(value = "info_id", type = IdType.AUTO)
    private Integer infoId;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 登录IP地址
     */
    private String ipaddr;

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
     * 登录状态（0成功 1失败）
     */
    private String status;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 访问时间
     */
    private LocalDateTime loginTime;

    /** 请求参数 */
    @TableField(exist = false)
    private Map<String, Object> params=new HashMap<>();

}
