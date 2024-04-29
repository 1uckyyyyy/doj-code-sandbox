package com.djay.dojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.Charset;
import java.security.Permission;

/**
 * @Description: 测试安全管理器
 * @Date: 2024/04/29 19:39
 * @Created by DJay
 */
public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}


