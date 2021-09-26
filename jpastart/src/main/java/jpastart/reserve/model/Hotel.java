package jpastart.reserve.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Grade grade;
}
