package com.priceAlert.ms.AI_gateway.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class ChatCompletionResponse {
  @NonNull
  String id;
  String object;
  long created;
  ChatCompletionModel chatCompletionModel;
  ChatCompletionProvider chatCompletionProvider;
  ChatCompletionChoice[] chatCompletionChoices;
  ChatCompletionUsage chatCompletionUsage;

}