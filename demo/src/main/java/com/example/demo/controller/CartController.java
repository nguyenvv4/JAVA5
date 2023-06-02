package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.Item;
import com.example.demo.model.MauSac;
import com.example.demo.repository.ChiTietSanPhamRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Controller
public class CartController {

    @Autowired
    private HttpSession httpSession;
    @Autowired
    ChiTietSanPhamRepository chiTietSanPhamRepository;

    @GetMapping("/cart/add")
    public String addToCart(@RequestParam("ctspId") UUID ctspId) {
        Optional<ChiTietSanPham> chiTietSanPham = chiTietSanPhamRepository.findById(ctspId);
        Item item = new Item(chiTietSanPham.get().getId(),
                chiTietSanPham.get().getSanPham().getTen(),
                chiTietSanPham.get().getMauSac().getTen(),
                1,
                chiTietSanPham.get().getGiaBan());
        Cart cartSesion = (Cart) httpSession.getAttribute("cart");
        if (cartSesion == null) {
            Cart cart = new Cart();
            ArrayList<Item> list = new ArrayList<>();
            list.add(item);
            cart.setItems(list);
            httpSession.setAttribute("cart", cart);
        } else {
            Cart cart = (Cart) httpSession.getAttribute("cart");
            ArrayList<Item> listItem = cart.getItems();
            for (Item itemTmp : listItem) {
                if (itemTmp.getIdCtsp().equals(ctspId)) {
                    itemTmp.setSoLuong(item.getSoLuong() + 1);
                    return "redirect:/chi-tiet-san-pham/hien-thi";
                }
            }
            listItem.add(item);
        }
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }

    @GetMapping("/cart/view")
    public String addToCart(Model model) {
        Cart cart = (Cart) httpSession.getAttribute("cart");
        System.out.println(cart.toString());
        ArrayList<Item> list = cart.getItems();
        model.addAttribute("gioHangChiTiet", list);
        return "gio-hang";
    }



}
