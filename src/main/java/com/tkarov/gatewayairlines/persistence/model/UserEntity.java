package com.tkarov.gatewayairlines.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class UserEntity implements Serializable {

    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<SearchEntity> searches;

    @OneToOne
    private VaccinationStatus vaccinationStatus;


}
