package net.jogeum.streamsender.event.sender;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.DingDongOutput;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@EnableBinding(DingDongOutput.class)
public class DingDongAdapter {

    @Bean
    @InboundChannelAdapter(value = DingDongOutput.OUTPUT, poller = @Poller(fixedDelay = "10000"))
    public MessageSource<String> dingDong() {
        return () -> new GenericMessage<>("ding dong !!");
    }
}
