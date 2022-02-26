package com.example.springactivemqcameldemo.component;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Counter {
    private long c = 0;

    public String getCount() {
        return "Count is " + c++;
    }

    public String getTimedCount() {
        return LocalDateTime.now() + " count: " + c++;
    }
}
