package com.djay.dojcodesandbox;

import com.djay.dojcodesandbox.model.ExecuteCodeRequest;
import com.djay.dojcodesandbox.model.ExecuteCodeResponse;
import com.djay.dojcodesandbox.model.ExecuteMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Slf4j
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }

    // 当子类去执行executeCode的时候，会对应去执行子类runFile的实现，这样可以既有默认的流程，也有自己独特的实现逻辑
    @Override
    public List<ExecuteMessage> runFile(File userCodeFile, List<String> inputList) {
        List<ExecuteMessage> executeMessageList = super.runFile(userCodeFile, inputList);
        log.info("使用模板方法设计模式重写原本的步骤");
        return executeMessageList;
    }
}


