package com.atguigu.system.service;

import com.atguigu.model.system.SysMenu;
import com.atguigu.model.vo.AssginMenuVo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author atguigu
 * @since 2023-10-12
 */
public interface SysMenuService extends IService<SysMenu> {

    //菜单列表(树形)
    List<SysMenu> findNodes();

    //删除菜单
    void removeMenuById(String id);

    //根据角色获取菜单
    List<SysMenu> findMenuByRoleId(String roleId);

    //给角色分配菜单的权限
    void doAssign(AssginMenuVo assginMenuVo);
}
