package br.com.clivet.tutors.model.response;

public record TutorResponse (
    String id,
    String name,
    String surname,
    String email,
    String tel){}
