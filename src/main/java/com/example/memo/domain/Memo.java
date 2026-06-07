package com.example.memo.domain;

// Spring framework
// jakarta api 차이??
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

// shift + 2 > 사용 가능한 어노테이션 모음
// 왜 AllArgsConstructor를 사용하지 않았나? >> id 때문에
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Memo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; // int : -2^31 ~ 2^31 -1
  private String title;
  private String content;

  public Memo(String title, String content) {
    this.title = title;
    this.content = content;
  }
}
// Setter를 쓰면 안되는 이유
// DB의 영속성을 위해서 -- @Data를 함부로 붙이지말기.
