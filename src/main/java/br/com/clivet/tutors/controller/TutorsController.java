package br.com.clivet.tutors.controller;

import br.com.clivet.tutors.model.request.TutorRequestPATCHDto;
import br.com.clivet.tutors.model.request.TutorRequestPOSTDto;
import br.com.clivet.tutors.model.response.TutorResponse;
import br.com.clivet.tutors.service.TutorsService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutors")
public class TutorsController {

    TutorsService service;

    public TutorsController(TutorsService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TutorResponse> createTutors(@Validated @RequestBody TutorRequestPOSTDto request){
        return ResponseEntity.ok(service.createTutor(request));
    }

    @GetMapping
    public ResponseEntity<TutorResponse> getTutors(){
        return null;
    }

    @PatchMapping
    public ResponseEntity<TutorResponse> updateTutors(@Validated @RequestBody TutorRequestPATCHDto request){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<TutorResponse> deleteTutors(){
        return null;
    }
}
