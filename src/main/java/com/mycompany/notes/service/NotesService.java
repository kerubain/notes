package com.mycompany.notes.service;

import com.mycompany.notes.domain.Notes;

import java.util.List;

public interface NotesService {
    List<Notes> getNotesByUsername();
    Notes getNote(Long idNote);
    Long insertNotes(Notes note);
    Notes updateNotes(Notes note);
    void deleteNotes(Long idNote);
}
