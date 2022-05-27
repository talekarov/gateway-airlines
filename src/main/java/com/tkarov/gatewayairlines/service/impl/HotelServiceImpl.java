package com.tkarov.gatewayairlines.service.impl;

import com.tkarov.gatewayairlines.persistence.model.SearchEntity;
import com.tkarov.gatewayairlines.persistence.model.UserEntity;
import com.tkarov.gatewayairlines.persistence.repository.SearchRepository;
import com.tkarov.gatewayairlines.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HotelServiceImpl implements HotelService {

    private final SearchRepository searchRepository;

    @Autowired
    public HotelServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public SearchEntity getLastSearch(UserEntity user) {
        List<SearchEntity> searchEntities = searchRepository.findByUser(user);
        Long searchId = searchEntities.stream().map(SearchEntity::getId).max(Long::compareTo).get();
        return searchRepository.getById(searchId);

    }
}
