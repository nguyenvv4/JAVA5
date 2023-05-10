package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/sinh-vien/")
public class SinhVienController {

    @GetMapping("/hien-thi")
    public String hienThiDanhSachLopHoc(Model model) {
        return "/lop-hoc";
    }
}
