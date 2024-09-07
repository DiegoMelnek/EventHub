package me.melnek.EventHub.repositories;

import me.melnek.EventHub.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    boolean existsByLocalEvent(String localEvent);

    List<Event> findByLocalEvent(String localEvent);
}
