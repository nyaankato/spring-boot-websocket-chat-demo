package com.example.websocketdemo.service;

import com.example.websocketdemo.model.ChatMessage;
import com.example.websocketdemo.model.InfoMessage;
import com.example.websocketdemo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final static String JOIN_MESSAGE_TEXT = "%s joined!";
    private final static String LEAVE_MESSAGE_TEXT = "%s left!";

    @Autowired
    private MessageRepository messageRepository;

    public void createChatMessage(ChatMessage chatMessage) {
        messageRepository.save(chatMessage);
    }

    public InfoMessage getJoinMessage(String relatedUser) {
        InfoMessage message = InfoMessage.builder()
               .type(InfoMessage.MessageType.JOIN)
               .content(String.format(JOIN_MESSAGE_TEXT, relatedUser))
               .relatedUser(relatedUser)
               .build();
        return message;
    }

    public InfoMessage getLeaveMessage(String relatedUser) {
        InfoMessage message = InfoMessage.builder()
                .type(InfoMessage.MessageType.LEAVE)
                .content(String.format(LEAVE_MESSAGE_TEXT, relatedUser))
                .relatedUser(relatedUser)
                .build();
        return message;
    }
}
