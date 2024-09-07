package me.melnek.EventHub.services.impl;

import me.melnek.EventHub.models.Event;
import me.melnek.EventHub.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    //list all events
    private List<Event> findAll(){
        return eventRepository.findAll();
    }

    //find event by id
    private Optional<Event> findById(Long id){
        return eventRepository.findById(id);
    }

    //find by location
    public List<Event> findByLocal(String localEvent){
        return eventRepository.findByLocalEvent(localEvent);
    }
}
