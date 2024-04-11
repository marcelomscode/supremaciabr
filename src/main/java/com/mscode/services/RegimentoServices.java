package com.mscode.services;

import com.mscode.entity.Regimento;
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
//        TypedQuery<Regimento> regras = manager.createQuery("from Regimento ORDER BY idRegimento", Regimento.class).setMaxResults(3);
//        return regras.getResultList();
        return  regimentoRepository.findFirst3ByOrderByIdDesc();

    }

    public List<Regimento> listaRegrasTodas(){
//        TypedQuery<Regimento> regras = manager.createQuery("from Regimento ORDER BY idRegimento", Regimento.class);
//        return regras.getResultList();
//
        return  regimentoRepository.findAllOrderByIdRegimento();

    }

//    public List<Regimento> listaRegrasUltimos(){
//        TypedQuery<Regimento> regras = manager.createQuery("from Regimento where idRegimento > 3", Regimento.class);
//        return regras.getResultList();
//    }
//
//
//    public void criaRegra(Regimento regra){
//        manager.persist(regra);
//    }
//
//    public void editaRegra(Regimento regra){
//        try {
//            manager.merge(regra);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao editar regra:" +e);
//        }
//    }
//
//    public void removeRegra(Integer idRegra) {
//        try {
//            Regimento regra = manager.find(Regimento.class, idRegra);
//            manager.remove(regra);
//        } catch (Exception e) {
//
//        }
//
//    }


}
