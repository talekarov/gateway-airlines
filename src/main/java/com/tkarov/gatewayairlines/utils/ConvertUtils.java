package com.tkarov.gatewayairlines.utils;

import com.tkarov.gatewayairlines.model.response.FlightResponseBody;
import com.tkarov.gatewayairlines.persistence.model.FlightEntity;

import java.util.List;
import java.util.stream.Collectors;

public final class ConvertUtils {

    private ConvertUtils() {
    }

    public static FlightResponseBody convertToFlightResponseBody(FlightEntity flightEntity) {
        return FlightResponseBody.builder()
                .id(flightEntity.getId())
                .origin(flightEntity.getOrigin())
                .destination(flightEntity.getDestination())
                .departureDate(flightEntity.getDepartureDate())
                .departureTime(flightEntity.getDepartureTime())
                .arrivalDate(flightEntity.getArrivalDate())
                .arrivalTime(flightEntity.getArrivalTime())
                .build();
    }

    public static List<FlightResponseBody> convertToFlightResponseBodies(List<FlightEntity> flightEntities) {
        return flightEntities.stream().map(ConvertUtils::convertToFlightResponseBody).collect(Collectors.toList());
    }
}
