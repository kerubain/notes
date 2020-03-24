package com.mycompany.notes.repository;

import com.mycompany.notes.domain.Notes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NotesRepository extends CrudRepository<Notes, Long> {
    List<Notes> findByUsername(String username);
}
