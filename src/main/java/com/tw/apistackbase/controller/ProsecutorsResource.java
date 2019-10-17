package com.tw.apistackbase.controller;

import com.tw.apistackbase.entity.Prosecutor;
import com.tw.apistackbase.service.ProsecutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class ProsecutorsResource {
    private final ProsecutorService prosecutorService;

    public ProsecutorsResource(ProsecutorService prosecutorSerive){
        this.prosecutorService = prosecutorSerive;
    }
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @GetMapping(path = "/prosecutors", produces = {"application/json"})
    public List<Prosecutor> getAll() {
        return this.prosecutorService.findAll();
    }

}
