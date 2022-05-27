package com.tkarov.gatewayairlines.persistence.repository;

import com.tkarov.gatewayairlines.persistence.model.SearchEntity;
import com.tkarov.gatewayairlines.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchRepository extends JpaRepository<SearchEntity, Long> {

    List<SearchEntity> findByUser(UserEntity user);
}
