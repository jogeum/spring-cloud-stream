package net.jogeum.streamsender.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author jogeum
 * @since 17/09/2019
 */
public interface Hello {
    String OUTPUT = "helloChannel";

    @Output(Hello.OUTPUT)
    MessageChannel output();
}
