package slin.castro.testing.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import slin.castro.testing.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
