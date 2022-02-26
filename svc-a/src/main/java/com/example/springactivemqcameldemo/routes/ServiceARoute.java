package com.example.springactivemqcameldemo.routes;

import com.example.springactivemqcameldemo.component.Counter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceARoute extends RouteBuilder {

    @Autowired
    private Counter counter;

    @Override
    public void configure() throws Exception {
        // every 5 sec (5000 msec)
        from("timer:my-activemq-timer?period=5000")
                .bean(counter, "getTimedCount")
                .log("${body}")
                .to("activemq:my-activemq-queue");
    }

}
