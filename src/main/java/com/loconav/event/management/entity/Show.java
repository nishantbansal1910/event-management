package com.loconav.event.management.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.loconav.event.management.enums.ShowFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "shows")
public class Show extends AbstractEntity {

    @Column(name = "start_time", nullable = false)
    private Long startTime;

    @Column(name = "show_format")
    @Enumerated(value = EnumType.STRING)
    private ShowFormat showFormat;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "layout_id", nullable = false)
    private Layout layout;

    @JsonManagedReference
    @OneToMany(mappedBy = "show")
    List<Price> prices;

}
