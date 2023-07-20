package com.loconav.event.management.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.loconav.event.management.enums.EventType;
import com.loconav.event.management.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "events")
public class Event extends AbstractEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "host")
    private String host;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "language")
    private Language language;

    @Column(name = "duration", nullable = false)
    private Long duration;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "no_of_user_rated")
    private Long noOfUserRated;

    @JsonManagedReference
    @OneToMany(mappedBy = "event")
    private List<Show> shows;
}
