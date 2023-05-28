package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
public class IdHoaDonChiTiet implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon hoaDon;


    @ManyToOne
    @JoinColumn(name = "id_chi_tiet_sp")
    private ChiTietSanPham chiTietSanPham;
}
