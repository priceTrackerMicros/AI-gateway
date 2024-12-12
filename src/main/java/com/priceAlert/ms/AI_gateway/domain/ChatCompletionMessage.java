package com.priceAlert.ms.AI_gateway.domain;

import lombok.Data;

@Data
public class ChatCompletionMessage {
  ChatCompletionRole chatCompletionRole;
  String content;

  public ChatCompletionMessage(ChatCompletionRole chatCompletionRole, String content) {
    this.chatCompletionRole = chatCompletionRole;
    this.content = content;
  }

}