package me.melnek.EventHub.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "tb_events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime dateEvent;
    private String localEvent;
    private Integer maxCapacityEvent;

    @Enumerated(EnumType.STRING)
    private EventsType statusEvent;


    @ManyToMany
    @JoinTable(
            name = "event_users",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<Users> participants;



    public Event(){

    }

    public Event(Long id, String title, String description, LocalDateTime dateEvent, String localEvent, Integer maxCapacityEvent, EventsType statusEvent) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateEvent = dateEvent;
        this.localEvent = localEvent;
        this.maxCapacityEvent = maxCapacityEvent;
        this.statusEvent = statusEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDateTime dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getLocalEvent() {
        return localEvent;
    }

    public void setLocalEvent(String localEvent) {
        this.localEvent = localEvent;
    }

    public Integer getMaxCapacityEvent() {
        return maxCapacityEvent;
    }

    public void setMaxCapacityEvent(Integer maxCapacityEvent) {
        this.maxCapacityEvent = maxCapacityEvent;
    }
    public EventsType getStatusEvent() {
        return statusEvent;
    }

    public EventsType isStatusEvent() {
        return statusEvent;
    }

    public void setStatusEvent(EventsType statusEvent) {
        this.statusEvent = statusEvent;
    }
    public List<Users> getUsers() {
        return participants;
    }

    public void setUsers(List<Users> participants) {
        this.participants = participants;
    }
}
