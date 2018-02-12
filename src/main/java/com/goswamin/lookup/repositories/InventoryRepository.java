package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory,Long> {
}
