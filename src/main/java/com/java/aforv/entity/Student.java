package com.java.aforv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std")
public class Student {

    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="mobile_number")
    private String mobileNumber;


}
