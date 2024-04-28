package com.djay.dojcodesandbox;


import com.djay.dojcodesandbox.model.ExecuteCodeRequest;
import com.djay.dojcodesandbox.model.ExecuteCodeResponse;

/**
 * @Description: 代码沙箱接口定义
 * @Date: 2024/04/22 23:48
 * @Created by DJay
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @return ExecuteCodeResponse
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
