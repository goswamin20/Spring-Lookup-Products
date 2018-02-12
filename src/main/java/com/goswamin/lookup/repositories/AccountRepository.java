package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
