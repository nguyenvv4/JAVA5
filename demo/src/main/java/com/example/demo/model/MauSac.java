package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "mau_sac")
@Entity
@Data
public class MauSac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
