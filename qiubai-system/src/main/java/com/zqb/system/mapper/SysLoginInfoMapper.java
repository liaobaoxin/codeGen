package com.zqb.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zqb.system.domain.SysLoginInfo;

import java.util.List;

/**
 * <p>
 * 系统访问记录 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2018-12-16
 */
public interface SysLoginInfoMapper extends BaseMapper<SysLoginInfo> {
    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    public void insertLogininfor(SysLoginInfo logininfor);

    /**
     * 查询系统登录日志集合
     *
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    public List<SysLoginInfo> selectLogininforList(SysLoginInfo logininfor);

    /**
     * 批量删除系统登录日志
     *
     * @param ids 需要删除的数据
     * @return
     */
    public int deleteLogininforByIds(String[] ids);

    /**
     * 清空系统登录日志
     */
    public int cleanLogininfor();

}
