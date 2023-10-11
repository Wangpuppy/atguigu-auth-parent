package com.atguigu.system.exception;

import com.atguigu.system.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 全局异常处理类
 * @Author wrystart
 * @Version
 * @Date 2023/10/10 16:12
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //1 全局异常
    @ExceptionHandler(Exception.class) //异常处理器
    @ResponseBody
    public Result error(Exception e){
        System.out.println("全局....");
        e.printStackTrace();
        return Result.fail().message("执行了全局异常处理");
    }

    //2 特定异常处理
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        System.out.println("特定....");
        e.printStackTrace();
        return Result.fail().message("执行了特定异常处理");
    }

    //3 自定义异常处理
    @ExceptionHandler(GuiguException.class)
    @ResponseBody
    public Result error(GuiguException e){
        e.printStackTrace();
        return Result.fail().code(e.getCode()).message(e.getMsg());
    }
}