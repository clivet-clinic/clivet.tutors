package br.com.clivet.tutors.repository;

import br.com.clivet.tutors.domain.TutorsDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorsRepository extends JpaRepository<TutorsDomain, Long>{
}
