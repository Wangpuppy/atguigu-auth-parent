package com.atguigu.system.costom;

import com.atguigu.system.utils.MD5;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @Description 自定义密码组件
 * @Author wrystart
 * @Version
 * @Date 2023/10/13 15:56
 */
@Component
public class CustomMD5Password implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return MD5.encrypt(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(MD5.encrypt(rawPassword.toString()));
    }
}
