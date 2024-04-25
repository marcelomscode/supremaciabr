package com.mscode.controller;

import com.mscode.entity.Membros;
import com.mscode.entity.Videos;
import com.mscode.services.MembrosService;
import com.mscode.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController

public class CacheRestController {

    @Autowired
    private MembrosService membrosService;

    @Autowired
    private VideoService videoService;


    @GetMapping("/clearCache")

    public ResponseEntity<HashMap> clearCache() {

        Membros membros = membrosService.findUniqueRecord();
        List<Videos> videos = videoService.listaUltimosVideo();

        HashMap<String, Object> cache = new HashMap<>();
        cache.put("home", membros);
        cache.put("videos", videos);

        System.out.println("Cache limpo com sucesso!");

        return ResponseEntity.ok(cache);
    }



}
