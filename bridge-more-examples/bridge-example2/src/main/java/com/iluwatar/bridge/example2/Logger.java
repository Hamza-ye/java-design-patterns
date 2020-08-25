package com.iluwatar.bridge.example2;

interface Logger {
  void log(String message);
}

class Info implements Logger {

  @Override
  public void log(String message) {
    System.out.println("info: " + message);
  }
}

class Warning implements Logger {

  @Override
  public void log(String message) {
    System.out.println("warning: " + message);
  }
}