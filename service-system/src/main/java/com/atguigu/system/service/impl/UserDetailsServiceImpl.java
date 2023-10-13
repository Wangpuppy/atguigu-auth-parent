package com.atguigu.system.service.impl;


import com.atguigu.model.system.SysUser;
import com.atguigu.system.costom.CustomUser;
import com.atguigu.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @Description
 * @Author wrystart
 * @Version
 * @Date 2023/10/13 16:01
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.getUserInfoByUserName(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        if (sysUser.getStatus().intValue()==0){
            throw new RuntimeException("用户被禁用了");

        }

        return new CustomUser(sysUser, Collections.emptyList());
    }
}
