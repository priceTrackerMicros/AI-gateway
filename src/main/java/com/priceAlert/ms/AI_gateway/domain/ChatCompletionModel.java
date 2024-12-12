package com.priceAlert.ms.AI_gateway.domain;

public enum ChatCompletionModel {
  Gpt4o("gpt-4o"),
  Gpt4("gpt-4"),
  Gpt4Turbo("gpt-4-turbo"),
  GeminiPro("gemini-pro");

  private String name;

  ChatCompletionModel() {
  }

  ChatCompletionModel(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

}
