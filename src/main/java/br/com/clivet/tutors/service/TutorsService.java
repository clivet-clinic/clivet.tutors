package br.com.clivet.tutors.service;

import br.com.clivet.tutors.domain.TutorsDomain;
import br.com.clivet.tutors.mapper.TutorsMapper;
import br.com.clivet.tutors.model.request.TutorRequestPOSTDto;
import br.com.clivet.tutors.model.response.TutorResponse;
import br.com.clivet.tutors.repository.TutorsRepository;
import org.springframework.stereotype.Service;

@Service
public class TutorsService {

    private TutorsMapper mapper;
    private TutorsRepository repository;

    public TutorResponse createTutor(TutorRequestPOSTDto request){
        TutorsDomain tutorsDomain = mapper.toEntity(request);
        TutorsDomain tutorsDomainSaved = repository.save(tutorsDomain);
        return mapper.toResponse(tutorsDomainSaved);
    }
}
