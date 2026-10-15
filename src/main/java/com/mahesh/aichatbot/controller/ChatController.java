package com.mahesh.aichatbot.controller;

import com.mahesh.aichatbot.dto.ChatRequest;
import com.mahesh.aichatbot.dto.ChatResponse;
import com.mahesh.aichatbot.service.ChatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {
    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    public ResponseEntity<ChatResponse> startChat(@RequestBody ChatRequest chatRequest) {
        ChatResponse chatResponse = chatService.doChat(chatRequest);
        return ResponseEntity.ok(chatResponse);
    }
}