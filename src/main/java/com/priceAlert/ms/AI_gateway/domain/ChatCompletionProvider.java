package com.priceAlert.ms.AI_gateway.domain;

public enum ChatCompletionProvider {
  ChatGptEs("ChatGptEs"),
  Airforce("Airforce"),
  Blackbox("Blackbox");

  private String name;

  ChatCompletionProvider() {
  }

  ChatCompletionProvider(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

}

