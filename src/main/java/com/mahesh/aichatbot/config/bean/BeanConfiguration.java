package com.mahesh.aichatbot.config.bean;

import com.mahesh.aichatbot.config.properties.OpenAIProperties;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(OpenAIProperties.class)
public class BeanConfiguration {

    @Bean
    public OpenAiChatModel openAiChatModel(OpenAIProperties openAIProperties) {
        return OpenAiChatModel.builder()
                .apiKey(openAIProperties.apiKey())
                .modelName(openAIProperties.modelName())
                .temperature(0.7)
                .build();
    }
}
