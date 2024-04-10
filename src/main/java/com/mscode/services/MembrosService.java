package com.mscode.services;

import com.mscode.entity.Membros;
import com.mscode.repositories.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembrosService {

    @Autowired
    private MembrosRepository membrosRepository;

    public List<Membros> findAll() {
        return membrosRepository.findAll();
    }

}
