package com.tkarov.gatewayairlines.persistence.repository;

import com.tkarov.gatewayairlines.persistence.model.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
FlightRepository extends JpaRepository<FlightEntity, Long> {

}
