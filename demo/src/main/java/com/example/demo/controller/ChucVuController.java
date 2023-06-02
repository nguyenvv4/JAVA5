package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/chuc-vu")
public class ChucVuController {

    @Autowired
    ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<ChucVu> list = chucVuService.getAll();
        model.addAttribute("chucVus", list);
        return "chuc-vu";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ma") String ma,
                       @RequestParam("ten") String ten) {
        ChucVu chucVu = new ChucVu();
        chucVu.setMa(ma);
        chucVu.setTen(ten);
        chucVuService.addNew(chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }
}
