package com.its.SpringMvcJsonMapperConfig.web;

import com.its.SpringMvcJsonMapperConfig.entity.Reservation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
@Slf4j
public class ReservationController {

    /*private ReservationService reservationService;



    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }*/



    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable String id) {
        log.info("1 Entering and leaving ReservationController : getReservation for id : {} ", id);
        Reservation aReservation = new Reservation("dhaval", "shah");
        return aReservation;
    }

}
