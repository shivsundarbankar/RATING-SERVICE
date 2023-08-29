package com.shivsundar.services.implementations;

import com.shivsundar.models.db.Ratings;
import com.shivsundar.repositories.RatingsRepository;
import com.shivsundar.services.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsServiceImpl implements RatingsService {

    @Autowired
    private RatingsRepository ratingsRepository;
    @Override
    public List<Ratings> findByUserId(Long userId) {
        return ratingsRepository.findByUserId(userId);
    }

    @Override
    public List<Ratings> findByHotelId(Long hotelId) {
        return ratingsRepository.findByHotelId(hotelId);
    }

    @Override
    public Ratings saveRatings(Ratings ratings) {
        return ratingsRepository.save(ratings);
    }
}
