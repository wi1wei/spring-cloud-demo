package com.exmaple;

import org.springframework.stereotype.Component;

/**
 * @author jjboom
 * @date 2018-09-10
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
