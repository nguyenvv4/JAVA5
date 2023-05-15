package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {

    private Integer id;

    private String hoTen;

    private Integer tuoi;

    private String diaChi;

    private Integer gioiTinh;
}
