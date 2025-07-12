package br.com.clivet.tutors.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "clivet_tutors")
public class TutorsDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name= "tutor_name", length= 100)
    String name;

    @Column(name= "tutor_surname", length= 100)
    String surname;

    @Column(name= "tutor_email", length= 100)
    String email;

    @Column(name= "tutor_contact", length= 20)
    String contact;

    @Column(name = "tutor_cpf", length = 11)
    String cpf;
}
