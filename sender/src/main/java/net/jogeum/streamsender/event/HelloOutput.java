package net.jogeum.streamsender.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author jogeum
 * @since 17/09/2019
 */
public interface HelloOutput {
    String OUTPUT = "helloOutput";

    @Output(HelloOutput.OUTPUT)
    MessageChannel output();
}
