package com.study.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Item {
  @Id // 기본 키를 나타내는 어노테이션입니다.
  @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본 키 생성 전략을 설정합니다.
  private Long id; // 상품 ID를 나타내는 필드입니다. Long 타입으로 선언합니다.

  private String team; // 팀 이름을 나타내는 필드입니다. String 타입으로 선언합니다.
  private String itemLink; // 상품 링크를 나타내는 필드입니다. String 타입으로 선언합니다.
  private LocalDateTime date; // 날짜를 나타내는 필드입니다. LocalDateTime 타입으로 선언합니다.
  private int price; // 가격을 나타내는 필드입니다. int 타입으로 선언합니다.

}
