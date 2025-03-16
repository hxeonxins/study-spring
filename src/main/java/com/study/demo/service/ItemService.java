package com.study.demo.service;

import com.study.demo.dto.ItemDto;
import com.study.demo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {
  private final ItemRepository itemRepository;

  public Optional<ItemDto> getItem(Long id) {
    return itemRepository.findById(id)
            .map(item -> {
              ItemDto itemDto = new ItemDto();
              itemDto.setId(item.getId());
              itemDto.setTeam(item.getTeam());
              itemDto.setItemLink(item.getItemLink());
              itemDto.setDate(item.getDate());
              itemDto.setPrice(item.getPrice());
              return itemDto;
            });
  }

  public List<ItemDto> getItems() {
    return itemRepository.findAll().stream()
            .map(item -> {
              ItemDto itemDto = new ItemDto();
              itemDto.setId(item.getId());
              itemDto.setTeam(item.getTeam());
              itemDto.setItemLink(item.getItemLink());
              itemDto.setDate(item.getDate());
              itemDto.setPrice(item.getPrice());
              return itemDto;
            })
            .collect(java.util.stream.Collectors.toList());
  }
}
