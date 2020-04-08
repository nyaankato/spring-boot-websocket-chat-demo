package com.example.websocketdemo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoMessage {
    private MessageType type;
    private String content;
    @NonNull
    private String relatedUser;

    public enum MessageType {
        INFO,
        JOIN,
        LEAVE
    }
}
