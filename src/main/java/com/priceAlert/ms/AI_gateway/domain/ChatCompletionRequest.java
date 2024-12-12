package com.priceAlert.ms.AI_gateway.domain;

import lombok.Data;

import java.util.List;

@Data
public class ChatCompletionRequest {
  List<ChatCompletionMessage> messages;
  ChatCompletionProvider chatCompletionProvider;
  ChatCompletionModel chatCompletionModel;
  boolean stream;
  boolean webSearch;
  boolean historyDisabled;
  boolean autoContinue;
  long timeout;

}