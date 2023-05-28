package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.NhanVien;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<NhanVien> list = nhanVienService.getAll();
        ArrayList<ChucVu> listChucVu =  chucVuService.getAll();
        model.addAttribute("listNhanVien", list);
        model.addAttribute("listChucVu", listChucVu);
        return "nhan-vien";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("chucVu") String idChucVu) {
        System.out.println(idChucVu);
        return "redirect:/nhan-vien/hien-thi";
    }
}
