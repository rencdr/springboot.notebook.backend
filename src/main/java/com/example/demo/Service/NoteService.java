package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Note;
import com.example.demo.Repository.NoteRepository;

@Service
public class NoteService {
	private final NoteRepository noteRepository;
	
	 @Autowired
	    public NoteService(NoteRepository noteRepository) {
	        this.noteRepository = noteRepository;
	    }

	    public List<Note> getAllNotes() {
	        return noteRepository.findAll();
	    }

	    public Note createNote(@RequestBody Note note) {
	        return noteRepository.save(note);
	    }

}
