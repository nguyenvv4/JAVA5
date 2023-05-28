package com.example.demo.controller;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/hoa-don-chi-tiet")
public class HoaDonChiTietController {

    @Autowired
    private HoaDonChiTietService hoaDonChiTietService;

    @GetMapping("/hien-thi")
    public String hienThi() {
        ArrayList<HoaDonChiTiet> hoaDonChiTiets = hoaDonChiTietService.getAll();

        for (HoaDonChiTiet hoaDonChiTiet : hoaDonChiTiets){
            System.out.println(hoaDonChiTiet.toString());
        }
            return null;
    }
}
