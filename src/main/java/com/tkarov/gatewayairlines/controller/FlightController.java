package com.tkarov.gatewayairlines.controller;

import com.tkarov.gatewayairlines.model.request.SearchRequestBody;
import com.tkarov.gatewayairlines.model.response.FlightResponseBody;
import com.tkarov.gatewayairlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<FlightResponseBody> findFlights(@RequestBody SearchRequestBody searchRequestBody, Long userId) {
        return flightService.getFlights(searchRequestBody, userId);
    }
}
