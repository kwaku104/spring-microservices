package com.microservice.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;

@Builder
@Data
@AllArgsConstructor // Constructor with all fields as parameters
// JPA specification requires that all persistent classes (@Entity) have
// a no-arg contructor, public or protected.
@NoArgsConstructor  // Constructor with no parameters
// Entities are POJOs representing data that can be persisted to the database
// Every instance of an entity represents a row in a database
@Entity
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    // Defines the types of primary key generation strategies
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
