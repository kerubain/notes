package com.mycompany.notes.controller;

import com.mycompany.notes.domain.Notes;
import com.mycompany.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ResourceController {
    @Autowired
    private NotesService notesService;

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Notes> getNotesByUsername(){
        return notesService.getNotesByUsername();
    }

    @RequestMapping(value = "/note", method = RequestMethod.GET)
    public Notes getNote(@RequestParam Long idNote){
        return notesService.getNote(idNote);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Long insertNotes(@RequestBody Notes note){
        return notesService.insertNotes(note);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.PUT)
    @ResponseStatus(code = HttpStatus.OK)
    public Notes updateNotes(@RequestParam Notes note){
        return notesService.updateNotes(note);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.DELETE)
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteNotes(@RequestParam Long idNote){
        notesService.deleteNotes(idNote);
    }

}
