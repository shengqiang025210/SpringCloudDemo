package com.example.democonsumer.controller;

import com.example.democonsumer.feign.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConsumerController
 * @Description: 消费者测试接口
 * @Author: shengqiang
 * @Date: 2019-08-20 14:34
 * @Version: 1.0
 **/
@RestController
public class ConsumerController {

  @Autowired
  private ProducerService producerService;

  @GetMapping("/consumer/hello/{param}")
  public String hello(@PathVariable String param){
    String result = producerService.hello(param);
    return result;
  }
}
