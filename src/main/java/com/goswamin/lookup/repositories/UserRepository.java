package com.goswamin.lookup.repositories;

import com.goswamin.lookup.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
