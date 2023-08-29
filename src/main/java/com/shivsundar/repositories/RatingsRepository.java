package com.shivsundar.repositories;

import com.shivsundar.models.db.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingsRepository extends JpaRepository<Ratings, Long> {

    List<Ratings> findByUserId(Long userId);
    List<Ratings> findByHotelId(Long hotelId);
}
