package com.atguigu.system.controller;


import com.atguigu.model.system.SysUser;
import com.atguigu.model.vo.SysUserQueryVo;
import com.atguigu.system.result.Result;
import com.atguigu.system.service.SysUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 用户管理接口
 * @Author wrystart
 * @Version       
 * @Date 2023/10/12 8:45
 */
@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/admin/system/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    //用户列表-条件分页查询
    @ApiOperation("用户列表")
    @GetMapping("{page}/{limit}")
    public Result list(@PathVariable Long page, @PathVariable Long limit, SysUserQueryVo sysUserQueryVo) {

        //创建page对象
        Page<SysUser> pageParam = new Page<>(page, limit);

        //调用service方法
        IPage<SysUser> pageModel = sysUserService.selectPage(pageParam, sysUserQueryVo);

        return Result.ok(pageModel);
    }

    //添加用户
    @ApiOperation("添加用户")
    @PostMapping("save")
    public Result save(@RequestBody SysUser user) {
        boolean isSuccess = sysUserService.save(user);
        if (isSuccess){
            return Result.ok();
        }else {
            return Result.fail();
        }

    }

    //根据id查询
    @ApiOperation("根据id查询")
    @GetMapping("getUserById/{id}")
    public Result getUserById(@PathVariable String id){
        SysUser user = sysUserService.getById(id);

        return Result.ok(user);
    }

    //修改用户
    @ApiOperation("修改用户")
    @PostMapping("update")
    public Result update(@RequestBody SysUser user){
        boolean isSuccess = sysUserService.updateById(user);
        if (isSuccess){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    //删除用户
    @ApiOperation("删除用户")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable String id){
        boolean isSuccess = sysUserService.removeById(id);
        if (isSuccess){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }




}

