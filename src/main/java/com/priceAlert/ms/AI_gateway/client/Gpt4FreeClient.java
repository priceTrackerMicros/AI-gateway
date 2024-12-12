package com.priceAlert.ms.AI_gateway.client;

import com.priceAlert.ms.AI_gateway.domain.ChatCompletionRequest;
import com.priceAlert.ms.AI_gateway.domain.ChatCompletionResponse;
import org.springframework.web.reactive.function.client.WebClient;

public class Gpt4FreeClient {

  public ChatCompletionResponse chatCompletion(ChatCompletionRequest chatCompletionRequest) {

    WebClient webClient = WebClient.builder()
            .baseUrl("http://129.151.196.101/v1/chat/completions")
            .build();

    // Send the POST request
    ChatCompletionResponse chatCompletionResponse = webClient.post()
            .header("accept", "application/json")
            .header("Content-Type", "application/json")
            .bodyValue(chatCompletionRequest)
            .retrieve()
            .bodyToMono(ChatCompletionResponse.class)
            .block(); // Blocking for simplicity (not recommended for reactive applications)

    // Print the response
    System.out.println("Response: " + chatCompletionResponse);

    return chatCompletionResponse;
  }

}
