package com.example.demo.controller;

import com.example.demo.model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/sinh-vien")
public class HomeController {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public HomeController() {
        listSinhVien.add(new SinhVien(1, "Nguyen Van A", 20, "Thanh Hoa", 1));
        listSinhVien.add(new SinhVien(2, "Nguyen Van B", 20, "Nghe An", 0));
        listSinhVien.add(new SinhVien(3, "Nguyen Van C", 20, "Ha Tinh", 1));
    }


    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSinhVien", listSinhVien);
        return "index";
    }

//    @GetMapping("/them")
//    public String them(Model model,
//                      @RequestParam("id") Integer id) {
//
//      listSinhVien.add(new SinhVien(id,))
//        model.addAttribute("listSinhVien", listSinhVien);
//        return "index";
//    }

    @GetMapping("/xoa")
    public String xoa(Model model,
                      @RequestParam("index") String index) {

        listSinhVien.remove(listSinhVien.get(Integer.parseInt(index)));
        model.addAttribute("listSinhVien", listSinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }
}
