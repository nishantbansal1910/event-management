package com.loconav.event.management.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "multiplexes")
public class Multiplex extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", unique = true)
    private String address;

    @Column(name = "city", nullable = false)
    private String city;

    @JsonManagedReference
    @OneToMany(mappedBy = "multiplex")
    List<Layout> layouts;

}
