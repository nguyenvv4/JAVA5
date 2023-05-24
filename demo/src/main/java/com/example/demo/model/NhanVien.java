package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity(name = "NhanVien")
@Table(name = "nhan_vien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {

    @Id
//    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ten_dem")
    private String tenDem;

    @Column(name = "ho")
    private String ho;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "mat_khau")
    private String matKhau;

//    @ManyToOne
//    @JoinColumn(name = "IdCH")
//    private CuaHang cuaHang;
//
//    @ManyToOne
//    @JoinColumn(name = "IdCV")
//    private ChucVu chucVu;

//    @ManyToOne
//    @JoinColumn(name = "IdGuiBC")
//    private NhanVien baoCao;

    @Column(name = "trang_thai")
    private int trangThai;
}
