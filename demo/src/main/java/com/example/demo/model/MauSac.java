package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "mau_sac")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MauSac {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String ma;

    private String ten;

    @Override
    public String toString() {
        return "MauSac{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
