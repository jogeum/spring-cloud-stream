package net.jogeum.streamreceiver.event.receiver;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamreceiver.event.HelloInput;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@EnableBinding(HelloInput.class)
public class HelloReceiver {

    @StreamListener(target = HelloInput.INPUT)
    public void receive(String helloMessage) {
        log.debug("helloMessage:" + helloMessage);
    }
}
