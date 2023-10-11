package com.atguigu.system.exception;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 自定义异常类
 * @Author wrystart
 * @Version
 * @Date 2023/10/10 16:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuiguException  extends RuntimeException {

    private Integer code;
    private String msg;

}
