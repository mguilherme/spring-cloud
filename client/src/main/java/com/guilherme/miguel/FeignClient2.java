package com.guilherme.miguel;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Miguel Guilherme
 */
@FeignClient(name = "service2", url = "${client.service2.url}")
public interface FeignClient2 {

    @RequestMapping("/service2")
    String call();

}
