package com.commons.booking.model;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bookings")
@EqualsAndHashCode
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type_room")
    private String typeRoom;

    @Column(name = "room_capacity")
    private Long roomCapacity;

    @Column(name = "room_number", nullable = false)
    private Long roomNumber;

    @Column(name = "entry_date", nullable = false)
    private LocalDate entryDate;

    @Column(name = "departure_date", nullable = false)
    private LocalDate departureDate;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "client_id", nullable = false)
    private Long clientId;

}
