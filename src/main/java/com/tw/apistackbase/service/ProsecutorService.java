package com.tw.apistackbase.service;

import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.entity.ProsecutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProsecutorService {
    @Autowired
    ProsecutorRepo prosecutorRepo;

    public List<Prosecutor> findAll() {
        return prosecutorRepo.findAll();
    }
}
