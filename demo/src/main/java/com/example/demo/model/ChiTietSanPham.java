package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "chi_tiet_sp")
@Entity
@Data
public class ChiTietSanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nam_bh")
    private Integer namBH;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Column(name = "gia_nhap")
    private BigDecimal giaNhap;

    @Column(name = "gia_ban")
    private BigDecimal giaBan;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mau_sac", referencedColumnName = "id")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_sp", referencedColumnName = "id")
    private SanPham sanPham;

}
