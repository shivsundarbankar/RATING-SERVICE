package com.shivsundar.controllers;

import com.shivsundar.models.db.Ratings;
import com.shivsundar.services.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rating Controller used to rate the hotel
 * @author Shivsundar Bankar
 * @version 1.0
 * @since 2023-08-28
 */
@RestController
@RequestMapping("/ratings")
public class RatingsController {

    @Autowired
    private RatingsService ratingsService;

    /**
     * it will save the rating for the particular userId
     * @param ratings
     * @return Ratings
     */
    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping("/saveRatings")
    public ResponseEntity<Ratings> saveRatings(@RequestBody Ratings ratings){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingsService.saveRatings(ratings));
    }
    @PreAuthorize("hasAuthority('SCOPE_internal')")
    @GetMapping("/findRatingsByUserId/{userId}")
    public ResponseEntity<List<Ratings>> findRatingsByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(ratingsService.findByUserId(userId));
    }
    @PreAuthorize("hasAuthority('SCOPE_internal')")
    @GetMapping("/findRatingsByHotelId/{hotelId}")
    public ResponseEntity<List<Ratings>> findRatingsByHotelId(@PathVariable Long hotelId){
        return ResponseEntity.ok(ratingsService.findByHotelId(hotelId));
    }
}
