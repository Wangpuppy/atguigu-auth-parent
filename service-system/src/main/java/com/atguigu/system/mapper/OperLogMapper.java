package com.atguigu.system.mapper;

import com.atguigu.model.system.SysLoginLog;
import com.atguigu.model.system.SysOperLog;
import com.atguigu.system.service.OperLogService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Description 
 * @Author wrystart
 * @Version       
 * @Date 2023/10/12 8:46
 */
@Repository
@Mapper
public interface OperLogMapper extends BaseMapper<SysOperLog> {



}
