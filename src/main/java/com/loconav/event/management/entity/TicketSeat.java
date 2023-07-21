package com.loconav.event.management.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticket_seat")
public class TicketSeat extends AbstractEntity {

    @Column(name = "seat_row", nullable = false)
    private String seatRow;

    @Column(name = "seat_column", nullable = false)
    private Integer seatColumn;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "status", nullable = false)
    private String status;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "show_id", nullable = false)
    private Show show;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;
}
