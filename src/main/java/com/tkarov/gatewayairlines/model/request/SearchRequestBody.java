package com.tkarov.gatewayairlines.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequestBody implements Serializable {

    static final long serialVersionUID = 1L;

    private String origin;

    private String destination;

    private LocalDate departureDate;

    private Integer numPassengers;

}
