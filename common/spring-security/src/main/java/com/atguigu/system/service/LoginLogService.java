package com.atguigu.system.service;

import com.atguigu.model.system.SysLoginLog;
import com.atguigu.model.vo.SysLoginLogQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @Description 记录登录日志
 * @Author wrystart
 * @Version
 * @Date 2023/10/16 16:43
 */
public interface LoginLogService {

    //登录日志
    public void recordLoginLog(String username, Integer status,String ipaddr,String message);


    //条件分页查询登录日志
    IPage<SysLoginLog> selectPage(Long page,Long limit, SysLoginLogQueryVo sysLoginLogQueryVo);

    //
    SysLoginLog getById(Long id);
}
