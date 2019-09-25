package net.jogeum.streamsender.service;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.event.sender.DefaultSender;
import net.jogeum.streamsender.event.sender.HelloSender;
import org.springframework.stereotype.Service;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@Service
public class MessageService {
    private DefaultSender defaultSender;
    private HelloSender helloSender;

    public MessageService(DefaultSender defaultSender, HelloSender helloSender) {
        this.defaultSender = defaultSender;
        this.helloSender = helloSender;
    }

    public void hi(String name, String message) {
        helloSender.send(name, message);
    }

    public void hola(String name, String message) {
        defaultSender.send(name, message);
    }
}
