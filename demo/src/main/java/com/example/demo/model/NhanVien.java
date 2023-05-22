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

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "MatKhau")
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

    @Column(name = "TrangThai")
    private int trangThai;
}
