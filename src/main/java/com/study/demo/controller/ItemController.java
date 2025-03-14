package com.study.demo.controller;

import com.study.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.web.bind.annotation.*;

@RestController //controller로 지정해주는 어노테이션
@RequestMapping("/hello") //주소창에 localhost:port/hello 작성 시 매핑 됨
@RequiredArgsConstructor //생성자 자동 생성(lombok)
public class ItemController {

  private final ItemService itemService;

  @GetMapping("/{item_id}")
  public ItemDto getItem(@PathVariable Long itemId) {
    //아이템 조회 API
    return itemService.getItem(itemId);
  }

  @PostMapping("/item/{item}")
  public AbstractReadWriteAccess.Item createItem(@PathVariable String item) {
    //아이템 추가 API
    return null;
  }
}
