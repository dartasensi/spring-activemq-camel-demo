package com.example.springactivemqcameldemo.component;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SvcASimpleLoggingProcessor implements Processor {

    private static final Logger log = LoggerFactory.getLogger(SvcASimpleLoggingProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        log.info("Processor has exchange message [{}]", exchange);
        log.info("Processor has exchange message body [{}]", exchange.getMessage().getBody());
    }
    
}
