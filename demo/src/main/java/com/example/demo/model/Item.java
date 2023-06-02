package com.example.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Item {

    private UUID idCtsp;

    private String tenSanPham;
    private String tenMau;

    private Integer soLuong;

    private BigDecimal giaBan;

    public Item(UUID idCtsp, String tenSanPham, String tenMau, Integer soLuong, BigDecimal giaBan) {
        this.idCtsp = idCtsp;
        this.tenSanPham = tenSanPham;
        this.tenMau = tenMau;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idCtsp=" + idCtsp +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenMau='" + tenMau + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                '}';
    }
}
