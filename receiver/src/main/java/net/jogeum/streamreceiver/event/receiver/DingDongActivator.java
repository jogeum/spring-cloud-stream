package net.jogeum.streamreceiver.event.receiver;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamreceiver.event.Bell;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

/**
 * @author jogeum
 * @since 18/09/2019
 */
@Slf4j
@EnableBinding(Bell.class)
public class DingDongActivator {

    @ServiceActivator(inputChannel = Bell.INPUT)
    public void dingDong(Message message) {
        log.debug("message:" + message);
    }
}
