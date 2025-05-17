package br.com.clivet.tutors.domain;

import jakarta.persistence.*;

@Entity(name = "clivet_tutors")
public class TutorsDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sclivet_tutors")
    @SequenceGenerator(name = "id_tutor", sequenceName = "sclivet_tutors", allocationSize = 1)
    Long id;

    @Column(name= "name_tutor", length= 20)
    String name;

    @Column(name= "surname_tutor", length= 100)
    String surname;

    @Column(name= "email_tutor", length= 100)
    String email;

    @Column(name= "tel_tutor", length= 19)
    String tel;

    @Column(name = "cpf_tutor", length = 11)
    String cpf;
}
