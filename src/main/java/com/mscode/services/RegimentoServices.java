package com.mscode.services;

import com.mscode.entity.Regimento;
import com.mscode.exceptions.RegimentoException;
import com.mscode.repositories.RegimentoRepository;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class RegimentoServices {


    @Autowired
    private RegimentoRepository regimentoRepository;

    public List<Regimento> listaRegras(){
        return  regimentoRepository.findFirst3ByOrderByIdDesc();
    }

    public List<Regimento> listaRegrasTodas(){
        return  regimentoRepository.findAllOrderByIdRegimento();
    }

    public void editaRegra(Regimento regra){
        try {
            regra.setActive(true);
            regimentoRepository.save(regra);
        } catch (Exception e) {
            throw new RegimentoException("Não foi possível editar regra:" +e);
        }
    }

    public void removeRegra(Long idRegra) {
        try {
            Regimento regra = regimentoRepository.findById(idRegra).orElseThrow();
            regra.setActive(false);
            regimentoRepository.save(regra);
        } catch (Exception e) {
            throw new RegimentoException();
        }

    }

        public void criaRegra(Regimento regra){
        try {
            regra.setActive(true);
            regimentoRepository.save(regra);
        } catch (Exception e) {
            throw new RegimentoException("Não foi possível criar regra:" +e);
        }
    }

//    public List<Regimento> listaRegrasUltimos(){
//        TypedQuery<Regimento> regras = manager.createQuery("from Regimento where idRegimento > 3", Regimento.class);
//        return regras.getResultList();
//    }

}
