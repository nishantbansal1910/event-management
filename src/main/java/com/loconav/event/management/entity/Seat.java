package com.loconav.event.management.entity;

import com.loconav.event.management.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seats", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"row", "col"})
})
public class Seat extends AbstractEntity {

    @Column(name = "row", nullable = false)
    private int row;

    @Column(name = "col", nullable = false)
    private int col;

    @Column(name = "rating", columnDefinition = "decimal(3,1) default 00.0")
    private Float rating;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "seat_type")
    private SeatType seatType;


}