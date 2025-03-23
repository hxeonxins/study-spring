package com.study.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class ItemDto {
  private Long id;
  private String team;
  private String itemLink;
  private LocalDateTime date;
  private int price;
}