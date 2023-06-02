package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "san_pham")
@Data
public class SanPham {
    @Id
    @GenericGenerator(name = "gennerator",strategy = "guid",parameters = {})
    @GeneratedValue(generator = "gennerator")
    @Column(name = "Id")
    private String id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;
}
