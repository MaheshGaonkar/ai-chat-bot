package com.mahesh.aichatbot.service;

import com.mahesh.aichatbot.dto.ChatRequest;
import com.mahesh.aichatbot.dto.ChatResponse;
import dev.langchain4j.model.chat.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatModel chatModel;

    @Autowired
    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public ChatResponse doChat(ChatRequest chatRequest) {
        String response = chatModel.chat(chatRequest.message());
        return new ChatResponse(response);
    }
}