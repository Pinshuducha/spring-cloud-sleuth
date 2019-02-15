package com.provider.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("provider"+name);
        return "这是服务提供者，参数："+name;
    }
}
