package me.melnek.EventHub.controllers;

import me.melnek.EventHub.models.Event;
import me.melnek.EventHub.services.impl.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventService eventService;

    @GetMapping("/local/{localEvent}")
    public List<Event> getEventsByLocal(@PathVariable String localEvent) {
        return eventService.findByLocal(localEvent);
    }
}
