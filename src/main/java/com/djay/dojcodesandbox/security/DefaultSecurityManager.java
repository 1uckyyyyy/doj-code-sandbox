package com.djay.dojcodesandbox.security;

import java.security.Permission;

/**
 * @Description: 默认的安全管理器
 * @Date: 2024/04/29 20:05
 * @Created by DJay
 */
/**
 * 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
//        super.checkPermission(perm);
    }
}

