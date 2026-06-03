package com.example.memo.service;

import com.example.memo.domain.Memo;
import com.example.memo.dto.MemoCreateRequest;
import com.example.memo.dto.MemoCreateResponse;
import com.example.memo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // final때문에 생성자 초기화를 꼭 해줘야하는데, 그냥 RequiredArgsConstructor 쓰면 됨.
public class MemoService {
  private final MemoRepository memoRepository;

  public MemoCreateResponse createMemo(MemoCreateRequest memoCreateRequest) {
    //  구조 분해 할당
    Memo memo = new Memo(memoCreateRequest.title(), memoCreateRequest.content());

    Memo savedMemo = memoRepository.save(memo);

    return MemoCreateResponse.from(savedMemo);
  }
}
