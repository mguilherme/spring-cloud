package com.guilherme.miguel;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Example to allow both, with and without registry server.
 * If url property is set (application.yml) it will have priority over name property (serviceID)
 * In a production environment don't set url property (this will force to find the serviceID by name).
 *
 * @author Miguel Guilherme
 */
@FeignClient(name = "service1", url = "${client.service1.url:}")
public interface FeignClient1 {

    @RequestMapping("/service1")
    String call();

}
