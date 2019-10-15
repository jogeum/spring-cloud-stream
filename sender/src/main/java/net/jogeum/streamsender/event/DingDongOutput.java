package net.jogeum.streamsender.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author jogeum
 * @since 17/09/2019
 */
public interface DingDongOutput {
    String OUTPUT = "dingDongOutput";

    @Output(DingDongOutput.OUTPUT)
    MessageChannel output();
}
