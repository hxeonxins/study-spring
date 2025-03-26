package com.study.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data //Getter, Setter 포함
public class ItemDto {
  private Long id;
  private String team;
  private String itemLink;
  private LocalDateTime date;
  private int price;
}