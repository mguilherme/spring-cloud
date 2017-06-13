package com.guilherme.miguel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Miguel Guilherme
 */
@Slf4j
@RestController
public class SomeController {

    @GetMapping("/service2")
    public String someStuff() {
        log.info("Service 2 call");
        return "Service 2";
    }

}
