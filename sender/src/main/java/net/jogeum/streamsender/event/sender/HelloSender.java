package net.jogeum.streamsender.event.sender;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.Hello;
import net.jogeum.streamsender.event.model.HelloMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@Component
@EnableBinding(Hello.class)
public class HelloSender {
    private MessageChannel helloChannel;

    public HelloSender(MessageChannel helloChannel) {
        this.helloChannel = helloChannel;
    }

    public void hi(String name, String message) {
        log.debug("message:" + message);
        HelloMessage helloMessage = HelloMessage.builder()
                .name(name)
                .message(message)
                .build();

        helloChannel
                .send(MessageBuilder.withPayload(helloMessage).build());
    }
}
