package com.tkarov.gatewayairlines.service.impl;

import com.tkarov.gatewayairlines.model.request.SearchRequestBody;
import com.tkarov.gatewayairlines.model.response.FlightResponseBody;
import com.tkarov.gatewayairlines.persistence.model.FlightEntity;
import com.tkarov.gatewayairlines.persistence.model.SearchEntity;
import com.tkarov.gatewayairlines.persistence.repository.FlightRepository;
import com.tkarov.gatewayairlines.persistence.repository.SearchRepository;
import com.tkarov.gatewayairlines.persistence.repository.UserRepository;
import com.tkarov.gatewayairlines.service.FlightService;
import com.tkarov.gatewayairlines.utils.ConvertUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FlightServiceImpl implements FlightService {


    private final FlightRepository flightRepository;
    private final SearchRepository searchRepository;
    private final UserRepository userRepository;

    @Autowired
    public FlightServiceImpl(FlightRepository flightRepository, SearchRepository searchRepository, UserRepository userRepository) {
        this.flightRepository = flightRepository;
        this.searchRepository = searchRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<FlightResponseBody> getFlights(SearchRequestBody searchRequestBody, Long id) {
        List<FlightEntity> flights = flightRepository.findAll()
                .stream()
                .filter(f -> f.getOrigin().equals(searchRequestBody.getOrigin()) &&
                        f.getDestination().equals(searchRequestBody.getDestination()) &&
                        f.getDepartureDate().equals(searchRequestBody.getDepartureDate()) &&
                        f.getAvailableSeats() >= searchRequestBody.getNumPassengers())
                .collect(Collectors.toList());

        searchRepository.save(SearchEntity.builder()
                .origin(searchRequestBody.getOrigin())
                .destination(searchRequestBody.getDestination())
                .departureDate(searchRequestBody.getDepartureDate())
                .passengers(searchRequestBody.getNumPassengers())
                .user(userRepository.getById(id))
                .build());

        return ConvertUtils.convertToFlightResponseBodies(flights);
    }

}

