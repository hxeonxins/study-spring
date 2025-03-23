package com.study.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@Setter
@NoArgsConstructor //JPA 기본 생성자 추가
public class Item {
  @Id // 기본 키를 나타내는 어노테이션
  @GeneratedValue(strategy = GenerationType.AUTO) // 기본 키 생성 전략 설정
  private Long id; // 상품 ID를 나타내는 필드. Long 타입으로 선언.

  private String team; // 팀 이름을 나타내는 필드
  private String itemLink; // 상품 링크를 나타내는 필드
  private LocalDateTime date; // 날짜를 나타내는 필드
  private int price; // 가격을 나타내는 필드

}
