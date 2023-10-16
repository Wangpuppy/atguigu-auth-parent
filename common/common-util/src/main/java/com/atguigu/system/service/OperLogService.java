package com.atguigu.system.service;

import com.atguigu.model.system.SysOperLog;
import com.atguigu.model.vo.SysOperLogQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @Description
 * @Author wrystart
 * @Version
 * @Date 2023/10/16 20:48
 */
public interface OperLogService {
    public void saveSysLog(SysOperLog sysLog);

    //操作日志分页查询
    IPage<SysOperLog> selectPage(Long page, Long limit, SysOperLogQueryVo sysOperLogQueryVo);

    SysOperLog getById(Long id);
}
