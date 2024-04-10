package com.commons.booking.model.mapper;

import com.commons.booking.model.Booking;
import com.commons.booking.model.DTO.BookingDTO;
import com.commons.booking.model.DTO.BookingResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "typeRoom", ignore = true)
    @Mapping(target = "totalPrice", ignore = true)
    Booking bookingDTOToBooking(BookingDTO bookingDTO);

    BookingResponse bookingToBookingResponse (Booking booking);


}
