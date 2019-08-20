package com.example.demoproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProducerController
 * @Description: 生产者对外提供接口
 * @Author: shengqiang
 * @Date: 2019-08-20 12:19
 * @Version: 1.0
 **/
@RestController
public class ProducerController {

  @GetMapping("/producer/hello/{param}")
  public String hello(@PathVariable String param){
    System.out.println("consumer服务接收到的参数："+param);
    return "producer服务收到消息,消息参数："+param;
  }
}
