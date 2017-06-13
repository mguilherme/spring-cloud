package com.guilherme.miguel;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Miguel Guilherme
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class SomeController {

    private final FeignClient1 feignClient1;

    private final FeignClient2 feignClient2;

    @GetMapping("/service1")
    public String callService1() {
        log.info("Calling Service 1 With Eureka");
        return feignClient1.call();
    }

    @GetMapping("/service2")
    public String callService2() {
        log.info("Calling Service 2");
        return feignClient2.call();
    }

}
