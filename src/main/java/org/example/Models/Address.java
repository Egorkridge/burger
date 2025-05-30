package org.example.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Address {
    private Long id;
    private String street;
    private String city;
    private Long house;
    private Long flat;
}
