package com.djay.dojcodesandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2024/04/26 16:14
 * @Created by DJay
 */
@RestController
public class MainController {

    @GetMapping("/getMapping")
    public String healthCheck() {
        return "ok";
    }

}
