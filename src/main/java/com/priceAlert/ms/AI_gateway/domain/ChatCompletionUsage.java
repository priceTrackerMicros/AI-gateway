package com.priceAlert.ms.AI_gateway.domain;

import lombok.Data;

@Data
public class ChatCompletionUsage {
  int promptTokens;
  int completionTokens;
  int totalTokens;
}
