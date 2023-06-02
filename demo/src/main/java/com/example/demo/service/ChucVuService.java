package com.example.demo.service;

import com.example.demo.model.ChucVu;

import java.util.ArrayList;
import java.util.UUID;

public interface ChucVuService {
    ArrayList<ChucVu> getAll();

    ChucVu addNew(ChucVu chucVu);

    void xoa(UUID id);
}
