package com.example.memo.dto;

import com.example.memo.domain.Memo;

public record MemoCreateResponse(
    Long id,
    String title,
    String content
) {
  // TODO: 정적 팩토리 메소드 -- 숙제 1
  // TODO: 레코드 클래스 -- 숙제 2 -> final을 자동으로 생성함. -- 사용자의 요청, 내부적인 시스템의 흐름
  public static MemoCreateResponse from(Memo memo) {
    return new MemoCreateResponse(memo.getId(), memo.getTitle(), memo.getContent());
  }
}
