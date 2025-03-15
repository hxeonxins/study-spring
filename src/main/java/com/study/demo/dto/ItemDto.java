package com.study.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ItemDto {
  private Long id;
  private String team;
  private String itemLink;
  private LocalDateTime date;
  private int price;
}