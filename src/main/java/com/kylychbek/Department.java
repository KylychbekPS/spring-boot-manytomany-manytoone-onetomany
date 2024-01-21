package com.kylychbek;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Kylychbek Parmankul
 */

@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue
    private  Integer  id;
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

}
