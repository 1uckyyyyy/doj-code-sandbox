package com.djay.dojcodesandbox.security;

import java.security.Permission;

/**
 * @Description: 禁用所有权限安全管理器
 * @Date: 2024/04/29 20:01
 * @Created by DJay
 */
public class DenySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常：" + perm.toString());
    }
}
