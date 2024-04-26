package com.mscode.services;

import com.mscode.entity.Membros;
import com.mscode.repositories.MembrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
public class MembrosService {

    @Autowired
    private MembrosRepository membrosRepository;

    public List<Membros> findAll() {
        return membrosRepository.findAll();
    }


    @Cacheable("membros")
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
            throw new RuntimeException("Não foi possível editar membros:" +e);
        }
    }
    
}
