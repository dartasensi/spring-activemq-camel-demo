package com.example.springactivemqcameldemo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SvcASimpleLoggingBean {
    private Logger log = LoggerFactory.getLogger(SvcASimpleLoggingBean.class);

    public void process(String message) {
        log.info("Logging the message is [{}]", message);
    }

}
