package com.example.memo.controller;

import com.example.memo.dto.MemoCreateRequest;
import com.example.memo.dto.MemoCreateResponse;
import com.example.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// 요청이 들어오면 -> controller단에서,
// RestController에서 REST는 Representational State Transfer의 약자 -> json 데이터만 반환
@RestController
@RequestMapping("/api/memos")
@RequiredArgsConstructor
public class MemoController {
  private final MemoService memoService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MemoCreateResponse createMemo(@RequestBody MemoCreateRequest memoCreateRequest) {
    return memoService.createMemo(memoCreateRequest);
  }
}
