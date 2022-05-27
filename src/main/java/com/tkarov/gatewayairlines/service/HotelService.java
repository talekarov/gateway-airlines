package com.tkarov.gatewayairlines.service;

import com.tkarov.gatewayairlines.model.request.UserRequestBody;
import com.tkarov.gatewayairlines.persistence.model.SearchEntity;
import com.tkarov.gatewayairlines.persistence.model.UserEntity;

public interface HotelService {

    SearchEntity getLastSearch(UserEntity user);
}
