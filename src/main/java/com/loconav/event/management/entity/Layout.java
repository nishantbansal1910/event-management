package com.loconav.event.management.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "layouts")
public class Layout extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "multiplex_id", nullable = false)
    private Multiplex multiplex;

    @JsonManagedReference
    @OneToMany(mappedBy = "layout")
    List<Show> shows;

    @JsonManagedReference
    @OneToMany(mappedBy = "layout")
    private List<Seat> seats;
}
