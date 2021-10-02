package jpastart.reserve.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class City {
    @Id
    @TableGenerator(
            name = "idgen" ,
            table = "id_gen" ,
            pkColumnName = "entity" ,
            pkColumnValue = "city" ,
            valueColumnName = "nextid" ,
            initialValue = 0 ,
            allocationSize = 1
    )
    @GeneratedValue(generator = "idgen")
    private Long id;
    private String city;

    public City() {
    }

    public City(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }
}
