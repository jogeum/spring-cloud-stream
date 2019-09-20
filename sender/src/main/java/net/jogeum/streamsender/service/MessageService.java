package net.jogeum.streamsender.service;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.sender.HelloSender;
import org.springframework.stereotype.Service;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@Service
public class MessageService {
    private HelloSender helloSender;
    public MessageService(HelloSender helloSender) {
        this.helloSender = helloSender;
    }

    public void hi(String name, String message) {
        helloSender.hi(name, message);
    }
}
