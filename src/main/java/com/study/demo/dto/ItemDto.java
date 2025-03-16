package com.study.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class ItemDto {
  @Getter
  private Long id;
  @Setter
  private String team;
  @Setter
  private String itemLink;
  @Setter
  private LocalDateTime date;
  @Setter
  private int price;
}