package net.jogeum.streamsender.event.sender;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.HelloOutput;
import net.jogeum.streamsender.event.model.HelloMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@Component
@EnableBinding(HelloOutput.class)
public class HelloSender {
    private HelloOutput hello;

    public HelloSender(HelloOutput hello) {
        this.hello = hello;
    }

    public void send(String name, String message) {
        log.debug("message:" + message);
        HelloMessage helloMessage = HelloMessage.builder()
                .name(name)
                .message(message)
                .build();

        hello.output()
                .send(MessageBuilder.withPayload(helloMessage).build());
    }
}
