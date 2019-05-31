package com.zqb.framework.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zqb.system.domain.SysConfig;
import com.zqb.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RuoYi首创 html调用 thymeleaf 实现参数管理
 *
 * @author ruoyi
 */
@Service("config")
public class ConfigService {
    @Autowired
    private ISysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     *
     * @param configName 参数名称
     * @return 参数键值
     */
    public String getKey(String configKey) {
        LambdaQueryWrapper<SysConfig> queryWrapper = new QueryWrapper<SysConfig>().lambda().eq(SysConfig::getConfigKey, configKey);
        SysConfig sysConfig = configService.getOne(queryWrapper);
        String key = sysConfig.getConfigValue();
        return key;
    }
}
