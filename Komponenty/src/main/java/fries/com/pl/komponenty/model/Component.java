package boguslawfries.com.pl.wypociny.model;

import lombok.*;

import  javax.persistence.Entity;

import javax.persistence.Id;
@Entity
@Getter
@Setter
@AllArgsConstructor

public class Component
{
    public Component() {};
    @Id
    private Integer id;
    private String name;
    private String description;
    private String logo;
    private Boolean active;

}
