package com.atguigu.system.controller;


import com.atguigu.model.system.SysMenu;
import com.atguigu.system.result.Result;
import com.atguigu.system.service.SysMenuService;
import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2023-10-12
 */
@Api(tags = "菜单管理接口")
@RestController
@RequestMapping("/admin/system/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    //菜单列表(树形)
    @ApiOperation("菜单列表")
    @GetMapping("findNodes")
    public Result findNodes() {
        List<SysMenu> list = sysMenuService.findNodes();
        return Result.ok(list);
    }

    //添加菜单
    @ApiOperation("添加菜单")
    @PostMapping("save")
    public Result save(@RequestBody SysMenu sysMenu) {
        sysMenuService.save(sysMenu);
        return Result.ok();
    }

    //根据id查询
    @ApiOperation("根据id查询")
    @GetMapping("findNode/{id}")
    public Result findNode(@PathVariable("id") String id) {
        SysMenu sysMenu = sysMenuService.getById(id);
        return Result.ok(sysMenu);
    }

    //修改菜单
    @ApiOperation("修改菜单")
    @PostMapping("update")
    public Result update(@RequestBody SysMenu sysMenu) {
        sysMenuService.updateById(sysMenu);
        return Result.ok();
    }

    //删除菜单
    @ApiOperation("删除菜单")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable("id") String id) {
        sysMenuService.removeById(id);
        return Result.ok();
    }

}

