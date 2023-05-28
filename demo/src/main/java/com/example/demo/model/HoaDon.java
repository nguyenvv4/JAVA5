package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Table(name = "hoa_don")
@Entity
@Data
public class HoaDon {
    @Id
    private UUID id;

    private String ma;

}
