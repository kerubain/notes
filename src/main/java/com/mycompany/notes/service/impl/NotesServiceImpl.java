package com.mycompany.notes.service.impl;

import com.mycompany.notes.domain.Notes;
import com.mycompany.notes.repository.NotesRepository;
import com.mycompany.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {
    @Autowired
    NotesRepository notesRepository;

    @Override
    public List<Notes> getNotesByUsername(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return notesRepository.findByUsername(auth.getName());
    }

    @Override
    public Notes getNote(Long idNote){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return notesRepository.findByUsernameAndIdNote(auth.getName(), idNote);
    }

    @Override
    public Long insertNotes(Notes note){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        note.setIdNote(null);
        note.setUsername(auth.getName());
        note.setCreateTime(new Date());
        note.setUpdateTime(null);
        return notesRepository.save(note).getIdNote();
    }

    @Override
    public Notes updateNotes(Notes note){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Notes note_ = notesRepository.findByUsernameAndIdNote(auth.getName(), note.getIdNote());
        //check if the user is the owner
        if(note_ != null) {
            note.setUsername(auth.getName());
            note.setCreateTime(note_.getCreateTime());
            note.setUpdateTime(new Date());
            return notesRepository.save(note);
        }

        return null;
    }

    @Override
    public void deleteNotes(Long idNote){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Notes note_ = notesRepository.findByUsernameAndIdNote(auth.getName(), idNote);
        //check if the user is the owner
        if(note_ != null) {
            notesRepository.deleteById(idNote);
        }
    }

}
