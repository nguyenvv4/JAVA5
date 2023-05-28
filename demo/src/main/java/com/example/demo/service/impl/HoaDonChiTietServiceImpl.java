package com.example.demo.service.impl;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.repository.HoaDonChiTietRepository;
import com.example.demo.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;

    @Override
    public ArrayList<HoaDonChiTiet> getAll() {
        return (ArrayList<HoaDonChiTiet>) hoaDonChiTietRepository.findAll();
    }
}
