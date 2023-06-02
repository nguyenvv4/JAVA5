package com.example.demo.service.impl;

import com.example.demo.model.ChucVu;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    ChucVuRepository chucVuRepository;


    @Override
    public ArrayList<ChucVu> getAll() {
        return (ArrayList<ChucVu>) chucVuRepository.findAll();
    }

    @Override
    public ChucVu addNew(ChucVu chucVu) {
        // xoas theo id
//        chucVuRepository.deleteById();
        return chucVuRepository.save(chucVu);
    }

    @Override
    public void xoa(UUID id) {
         chucVuRepository.deleteById(id);
    }
}
