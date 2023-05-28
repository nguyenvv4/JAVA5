package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@Data
public class ChiTietSanPham {

    @Id
    private UUID id;

}
