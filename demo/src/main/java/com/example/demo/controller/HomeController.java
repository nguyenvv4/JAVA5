package com.example.demo.controller;

import com.example.demo.model.MauSac;
import com.example.demo.model.NhanVien;
import com.example.demo.model.SinhVien;
import com.example.demo.repository.MauSacRepository;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/sinh-vien")
public class HomeController {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

//    SinhVienService sinhVienService = new SinhVienServiceImpl();
    @Autowired
    SinhVienService sinhVienService;

    @Autowired
    NhanVienRepository nhanVienRepository;


    @Autowired
    private MauSacRepository mauSacRepository;

    public HomeController() {
        listSinhVien.add(new SinhVien(1, "Nguyen Van A", 20, "Thanh Hoa", 1));
        listSinhVien.add(new SinhVien(2, "Nguyen Van B", 20, "Nghe An", 0));
        listSinhVien.add(new SinhVien(3, "Nguyen Van C", 20, "Ha Tinh", 1));
    }


    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
//        model.addAttribute("listSinhVien", listSinhVien);
        ArrayList<NhanVien> list = (ArrayList<NhanVien>) nhanVienRepository.findAll();
        System.out.println(list.get(0).toString());
        return "index";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("id") Integer id) {
        System.out.println("id la: " + id);
//      listSinhVien.add(new SinhVien(id,))
//        model.addAttribute("listSinhVien", listSinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoa(Model model,
                      @RequestParam("index") String index) {

        listSinhVien.remove(listSinhVien.get(Integer.parseInt(index)));
        model.addAttribute("listSinhVien", listSinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }

    //cach 1
//    @GetMapping("/detail")
//    public String detail(Model model,
//                         @RequestParam("id") Integer id) {
//        System.out.println("id la: " + id);
//        for (SinhVien sinhVien : listSinhVien) {
//            if (sinhVien.getId() == id) {
//                model.addAttribute("sinhVien", sinhVien);
//            }
//        }
//        return "detail";
//    }

    //cach 2
    @GetMapping("/detail/{id}")
    public String detail(Model model,
                         @PathVariable("id") Integer id) {
        System.out.println("id la: " + id);
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getId() == id) {
                model.addAttribute("sinhVien", sinhVien);
            }
        }
        return "detail";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") Integer id,
                         @RequestParam("hoTen") String hoTen,
                         @RequestParam("tuoi") Integer tuoi,
                         @RequestParam("diaChi") String diaChi) {

        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getId() == id) {
                sinhVien.setDiaChi(diaChi);
                sinhVien.setTuoi(tuoi);
                sinhVien.setHoTen(hoTen);
            }
        }

        return "redirect:/sinh-vien/hien-thi";
    }

    @PostMapping("/search")
    public String search(Model model,
                         @RequestParam("hoTen") String hoTen) {
        ArrayList<SinhVien> listSinhVienSearch = new ArrayList<>();
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getHoTen().contains(hoTen)) {
                listSinhVienSearch.add(sinhVien);
            }
        }
        model.addAttribute("listSinhVien",listSinhVienSearch);

        return "index";
    }

}
