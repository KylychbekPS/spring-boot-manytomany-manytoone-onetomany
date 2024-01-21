package com.kylychbek;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue
    private  Integer id;
    @Column(nullable = false,
    unique = true
    )
    private  String identifier;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeeRole role;
    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
}
