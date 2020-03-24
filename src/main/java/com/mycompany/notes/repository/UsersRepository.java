package com.mycompany.notes.repository;

import com.mycompany.notes.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, String> {
}
