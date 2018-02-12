package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
