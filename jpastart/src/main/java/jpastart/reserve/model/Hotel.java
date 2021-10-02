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

    public enum Grade {STAR1, STAR2, STAR3, STAR4, STAR5};

    public Hotel() {
    }

    public Hotel(String id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
