package com.example.demo.controller;

import com.example.demo.model.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @GetMapping("/hien-thi")
    public String hienThi() {
        ArrayList<NhanVien> list = (ArrayList<NhanVien>) nhanVienRepository.findAll();
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
        return null;
    }

}
