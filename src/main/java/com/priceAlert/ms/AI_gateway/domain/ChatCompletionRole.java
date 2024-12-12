package com.priceAlert.ms.AI_gateway.domain;

public enum ChatCompletionRole {
  SYSTEM("system"),
  USER("user"),
  ASSISTANT("assistant");

  String name;

  ChatCompletionRole() {
  }

  ChatCompletionRole(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
