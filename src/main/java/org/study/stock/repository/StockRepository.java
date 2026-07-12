package org.study.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.stock.domain.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
