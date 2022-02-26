package com.example.springactivemqcameldemo.component;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class SvcATimeBean {
    public String getTime() {
        return "Time is " + LocalDateTime.now();
    }
}
