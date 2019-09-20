package net.jogeum.streamreceiver.event.receiver;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamreceiver.event.Hello;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@EnableBinding(Hello.class)
public class HelloReceiver {

    @StreamListener(target = Hello.INPUT)
    public void receiveHello(String helloMessage) {
        log.debug("helloMessage:" + helloMessage);
    }
}
