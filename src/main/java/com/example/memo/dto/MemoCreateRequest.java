package com.example.memo.dto;

public record MemoCreateRequest(
    String title,
    String content
  ) {

  }
