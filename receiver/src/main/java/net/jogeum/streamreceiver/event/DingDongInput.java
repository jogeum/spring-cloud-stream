package net.jogeum.streamreceiver.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author jogeum
 * @since 17/09/2019
 */
public interface DingDongInput {
    String INPUT = "dingDongInput";

    @Input(DingDongInput.INPUT)
    SubscribableChannel input();
}
