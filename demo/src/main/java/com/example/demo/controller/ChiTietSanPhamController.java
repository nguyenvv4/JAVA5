package com.example.demo.controller;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.repository.ChiTietSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/chi-tiet-san-pham")
public class ChiTietSanPhamController {


    @Autowired
    ChiTietSanPhamRepository chiTietSanPhamRepository;
    @GetMapping("/hien-thi")
    public String hienThi(Model model){

        ArrayList<ChiTietSanPham> list = (ArrayList<ChiTietSanPham>) chiTietSanPhamRepository.findAll();
        model.addAttribute("chiTietSanPhams", list);
        return "chi-tiet-san-pham";
    }
}
