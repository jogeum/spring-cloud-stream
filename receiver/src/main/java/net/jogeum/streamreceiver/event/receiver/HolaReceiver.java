package net.jogeum.streamreceiver.event.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@EnableBinding(Sink.class)
public class HolaReceiver {

    @StreamListener(target = Sink.INPUT)
    public void receive(String holaMessage) {
        log.debug("holaMessage:" + holaMessage);
    }
}
