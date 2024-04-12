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

    
    public Membros  findUniqueRecord() {
        return membrosRepository.findUniqueRecord();
    }

    public void criaMembros(Membros membro){
        membrosRepository.save(membro);
    }

    public void editaQtdMembros(Membros membros) {
        try {
            membrosRepository.save(membros);
        } catch (Exception e) {
            e.getCause();
        }
    }
    
}
