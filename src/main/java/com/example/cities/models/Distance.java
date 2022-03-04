package com.example.cities.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "distance")
@Data
public class Distance {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "from_city", referencedColumnName = "id")
    private City fromCity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "to_city", referencedColumnName = "id")
    @Column(name = "toCity")
    private City toCity;
    @Column(name = "distance")
    private Long distance;
}
