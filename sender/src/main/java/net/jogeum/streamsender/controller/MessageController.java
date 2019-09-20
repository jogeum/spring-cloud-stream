package net.jogeum.streamsender.controller;

import lombok.extern.slf4j.Slf4j;
import net.jogeum.streamsender.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Slf4j
@RestController
@RequestMapping("/messages")
public class MessageController {
    private MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public ResponseEntity hi(@RequestParam String name, @RequestParam String message) {
        log.debug("name:" + name + ", message:" + message);
        messageService.hi(name, message);

        return ResponseEntity.ok("");
    }
}
