package com.shivsundar.services;

import com.shivsundar.models.db.Ratings;

import java.util.List;

public interface RatingsService {
    List<Ratings> findByUserId(Long userId);
    List<Ratings> findByHotelId(Long hotelId);
    Ratings saveRatings(Ratings ratings);
}
