package br.com.clivet.tutors.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record TutorRequestPATCHDto (

    @NotNull(message = "O campo nome não pode ser nulo")
    String name,

    @NotNull(message = "O campo sobrenome não pode ser nulo")
    String surname,

    @NotNull(message = "O campo email não pode ser nulo")
    @Email
    String email,

    @Pattern(
            regexp = "^\\+\\d{1,3}\\s?\\(?\\d{2}\\)?\\s?9\\d{4}-?\\d{4}$",
            message = "Número de telefone inválido. Use o formato +55 (11) 91234-5678"
    )
    String tel){}
