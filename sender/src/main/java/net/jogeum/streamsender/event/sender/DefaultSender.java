package net.jogeum.streamsender.event.sender;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.model.HelloMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author jogeum
 * @since 25/09/2019
 */
@Slf4j
@EnableBinding(Source.class)
public class DefaultSender {
    private Source source;

    public DefaultSender(Source source) {
        this.source = source;
    }

    public void send(String name, String message) {
        log.debug("message:" + message);
        HelloMessage helloMessage = HelloMessage.builder()
                .name(name)
                .message(message)
                .build();

        //기본 채널로 메시지 전송
        source.output()
                .send(MessageBuilder.withPayload(helloMessage).build());
    }
}
