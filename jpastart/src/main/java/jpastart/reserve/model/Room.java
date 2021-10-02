package jpastart.reserve.model;

import javax.persistence.*;

@Entity
@Table(name = "room_info")
public class Room {
    @Id
    private String number;
    private String name;
    @Column(name="description")
    private String description;

    @Transient
    private long timestamp = System.currentTimeMillis();

    @Column(name="id", insertable = false, updatable = false)
    @Access(AccessType.PROPERTY)
    private Long dbId;

    public Room() {
    }

    public Room(String number, String name, String description, Long dbId) {
        this.number = number;
        this.name = name;
        this.description = description;
        this.dbId = dbId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDbId() {
        return dbId;
    }

    public void setDbId(Long dbId) {
        this.dbId = dbId;
    }
}
