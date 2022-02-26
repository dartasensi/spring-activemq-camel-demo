package com.example.springactivemqcameldemo.routes;

import com.example.springactivemqcameldemo.component.SvcACounterBean;
import com.example.springactivemqcameldemo.component.SvcASimpleLoggingBean;
import com.example.springactivemqcameldemo.component.SvcASimpleLoggingProcessor;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//DART disabled
//@Component 
public class SvcATimerRouter extends RouteBuilder {

    // @Autowired
    // private SvcATimeBean timeBean;

    @Autowired
    private SvcACounterBean counter;

    @Autowired
    private SvcASimpleLoggingBean simpleLoggingBean;

    @Override
    public void configure() throws Exception {
        // Route:
        // listen to a queue for a message
        // transform the message
        // save into something else

        // in this case
        from("timer:svc-a-timer")

                // to inject a costant messages
                // .transform().constant("constant message")

                // to use an autowired bean
                // .bean(svcATimeBean)

                // to use an autowired bean, on a specific message
                //.bean(timeBean, "getTime")

                // to use an autowired bean with a counter
                .bean(counter)

                // to log message body
                .log("${body}")

                // to use another bean with void
                .bean(simpleLoggingBean)

                .bean(new SvcASimpleLoggingProcessor())

                .to("log:svc-a-log");
    }

}
