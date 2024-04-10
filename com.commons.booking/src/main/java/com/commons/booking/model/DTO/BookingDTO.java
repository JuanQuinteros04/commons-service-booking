package com.commons.booking.model.DTO;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@EqualsAndHashCode
public class BookingDTO {

    private Long roomNumber;

    private LocalDate entryDate;

    private LocalDate departureDate;

    private Long clientId;
}
