package net.jogeum.streamsender.event.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author jogeum
 * @since 17/09/2019
 */
@Getter
@ToString
public class HelloMessage implements Serializable {
    private static final long serialVersionUID = -455431710485652305L;
    private String name;
    private String message;

    @Builder
    public HelloMessage(String name, String message) {
        this.name = Objects.requireNonNull(name);
        this.message = Objects.requireNonNull(message);
    }
}
