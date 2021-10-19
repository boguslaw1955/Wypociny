package fries.com.pl.komponenty.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
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

