package com.example.springactivemqcameldemo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ServiceBRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:my-activemq-queue")
                //.transform().constant("fixed value")
                .to("log:my-activemq-queue");
    }

}
