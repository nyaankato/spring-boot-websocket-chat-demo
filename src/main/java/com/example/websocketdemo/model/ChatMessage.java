package com.example.websocketdemo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by rajeevkumarsingh on 24/07/17.
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="messages")
public class ChatMessage {
    @Id
    @GeneratedValue
    private long id;
    //private MessageType type;
    private String content;
    @NonNull
    @ManyToOne
    private User user;

//    public enum MessageType {
//        CHAT,
//        JOIN,
//        LEAVE
//    }
}
