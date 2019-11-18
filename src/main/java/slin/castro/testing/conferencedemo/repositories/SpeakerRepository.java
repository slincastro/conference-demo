package slin.castro.testing.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import slin.castro.testing.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
