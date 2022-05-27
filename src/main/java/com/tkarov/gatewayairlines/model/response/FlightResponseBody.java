package com.tkarov.gatewayairlines.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightResponseBody implements Serializable {

    static final long serialVersionUID = 1L;

    @NotNull
    private Long id;

    @NotEmpty
    private String origin;

    @NotEmpty
    private String destination;

    @NotNull
    private LocalDate departureDate;

    @NotNull
    private LocalTime departureTime;

    @NotNull
    private LocalTime arrivalTime;

    @NotNull
    private LocalDate arrivalDate;

}
