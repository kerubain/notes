package com.mycompany.notes.repository;

import com.mycompany.notes.domain.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Notes, Long> {
}
