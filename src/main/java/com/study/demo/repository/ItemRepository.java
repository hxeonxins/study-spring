package com.study.demo.repository;

import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<AbstractReadWriteAccess.Item, Long> {

}
