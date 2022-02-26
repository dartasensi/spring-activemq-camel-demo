package com.example.springactivemqcameldemo.component;

import org.springframework.stereotype.Component;

@Component
public class Counter {
    private long c = 0;

    public String getCount() {
        return "Count is " + c++;
    }

}
