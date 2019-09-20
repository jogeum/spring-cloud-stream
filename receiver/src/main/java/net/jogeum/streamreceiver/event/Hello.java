package net.jogeum.streamreceiver.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author jogeum
 * @since 17/09/2019
 */
public interface Hello {
    String INPUT = "helloChannel";

    @Input(Hello.INPUT)
    SubscribableChannel input();
}
