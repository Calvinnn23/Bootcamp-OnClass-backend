package com.pragma.bootcamp2024.adapters.driven.jpa.mysql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "capacity")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CapacityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "capacity_technology",
            joinColumns = @JoinColumn(name = "capacity_id"),
            inverseJoinColumns = @JoinColumn(name = "technology_id")
    )
    private List<TechnologyEntity> technologies;
}
