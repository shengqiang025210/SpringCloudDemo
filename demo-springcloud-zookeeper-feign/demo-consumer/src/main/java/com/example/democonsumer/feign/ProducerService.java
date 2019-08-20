package com.example.democonsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: ProducerInterface
 * @Description: 生产者对外接口
 * @Author: shengqiang
 * @Date: 2019-08-20 14:38
 * @Version: 1.0
 **/
@FeignClient("demo-producer")
public interface ProducerService {

  @GetMapping("/producer/hello/{param}")
  String hello(@PathVariable("param")String param);
}
