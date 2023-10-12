package com.atguigu.system.mapper;

import com.atguigu.model.system.SysUser;
import com.atguigu.model.vo.SysUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**
 * @Description 
 * @Author wrystart
 * @Version       
 * @Date 2023/10/12 8:46
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    //用户列表
    IPage<SysUser> selectPage(Page<SysUser> pageParam,@Param("vo") SysUserQueryVo sysUserQueryVo);

}
