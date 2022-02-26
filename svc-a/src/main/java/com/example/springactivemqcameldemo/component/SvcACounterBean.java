package com.example.springactivemqcameldemo.component;

import org.springframework.stereotype.Component;

@Component
public class SvcACounterBean {
    private long counter = 0;

    public String getCount() {
        return "Count is now " + counter++;
    }
}
