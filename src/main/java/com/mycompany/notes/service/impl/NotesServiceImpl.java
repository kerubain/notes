package com.mycompany.notes.service.impl;

import com.mycompany.notes.domain.Notes;
import com.mycompany.notes.repository.NotesRepository;
import com.mycompany.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {
    @Autowired
    NotesRepository notesRepository;

    @Override
    public List<Notes> getNotesByUsername(String username){
        return notesRepository.findByUsername(username);
    }

    @Override
    public Notes getNote(Long idNote){
        return notesRepository.findById(idNote).orElse(null);
    }

    @Override
    public Long insertNotes(Notes note){
        return notesRepository.save(note).getIdNote();
    }

    @Override
    public Notes updateNotes(Notes note){
        return notesRepository.save(note);
    }

    @Override
    public void deleteNotes(Long idNote){
        notesRepository.deleteById(idNote);
    }

}
