package com.onlyas.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        return "2019-4-16，哈哈，Hello 世界 Docker!";
    }
}
