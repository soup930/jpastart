package jpastart.reserve.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hotel_review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hotel_id")
    private String hotelId;
    private int rate;
    private String comment;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rating_date")
    private Date ratingDate;

    protected Review() {

    }

    public Review(String hotelId, int rate, String comment) {
        this.id = id;
        this.hotelId = hotelId;
        this.rate = rate;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", hotelId='" + hotelId + '\'' +
                ", rate=" + rate +
                ", comment='" + comment + '\'' +
                '}';
    }
}
