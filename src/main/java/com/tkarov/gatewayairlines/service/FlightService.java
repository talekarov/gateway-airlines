package com.tkarov.gatewayairlines.service;

import com.tkarov.gatewayairlines.model.request.SearchRequestBody;
import com.tkarov.gatewayairlines.model.response.FlightResponseBody;

import java.util.List;

public interface FlightService {

    List<FlightResponseBody> getFlights(SearchRequestBody searchRequestBody, Long id);


}
