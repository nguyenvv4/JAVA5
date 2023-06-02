package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Table(name = "hoa_don_chi_tiet")
@Entity
@Data
public class HoaDonChiTiet {
    @EmbeddedId
    private IdHoaDonChiTiet id;

    private Integer soLuong;

    private Long donGia;

    @Override
    public String toString() {
        return
                "Ma Hoa Don=" + id.getHoaDon().getMa() +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                "Chi Tiet san Pham: " + id.getChiTietSanPham().getId();
    }
}
