package com.mahesh.aichatbot.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "openai")
public record OpenAIProperties(String apiKey, String modelName) { }