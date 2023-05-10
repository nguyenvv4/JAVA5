package com.example.demo.controller;

import com.example.demo.model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/sinh-vien/")
public class SinhVienController {

    @GetMapping("/hien-thi")
    public String hienThiDanhSachLopHoc(Model model) {

        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien(1, "Nguyen Van A"));
        listSinhVien.add(new SinhVien(2,"Tran Thi B"));
        model.addAttribute("list", listSinhVien);
        return "lop-hoc";
    }
}
