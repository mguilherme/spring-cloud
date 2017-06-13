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

    @GetMapping("/service1")
    public String someStuff() {
        log.info("Service 1 call");
        return "Service 1";
    }

}
