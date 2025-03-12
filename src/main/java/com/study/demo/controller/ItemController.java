package com.study.demo.controller;

import com.study.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controller로 지정해주는 어노테이션
@RequestMapping("/")
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;

  @GetMapping("/item")
  public AbstractReadWriteAccess.Item getItem(@RequestBody AbstractReadWriteAccess.Item item) {

    return item;
  }
}
