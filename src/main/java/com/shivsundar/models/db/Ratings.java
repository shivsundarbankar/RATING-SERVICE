package com.shivsundar.models.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "ratings_details")
public class Ratings {
    @Id
    private Long ratingId;
    private Long userId;
    private Long hotelId;
    private Integer rating;
}
