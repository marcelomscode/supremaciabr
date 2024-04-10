package com.mscode.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "membros")
public class Membros {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idMembros;
    private Integer lider;
    private Integer comissarios;
    private Integer tenentes;
    private Integer representantes;
    private Integer capangas;


    public Integer getLider() {
        return lider;
    }
    public void setLider(Integer lider) {
        this.lider = lider;
    }
    public Integer getIdMembros() {
        return idMembros;
    }
    public void setIdMembros(Integer idMembros) {
        this.idMembros = idMembros;
    }
    public Integer getComissarios() {
        return comissarios;
    }
    public void setComissarios(Integer comissarios) {
        this.comissarios = comissarios;
    }
    public Integer getTenentes() {
        return tenentes;
    }
    public void setTenentes(Integer tenentes) {
        this.tenentes = tenentes;
    }
    public Integer getRepresentantes() {
        return representantes;
    }
    public void setRepresentantes(Integer representantes) {
        this.representantes = representantes;
    }
    public Integer getCapangas() {
        return capangas;
    }
    public void setCapangas(Integer capangas) {
        this.capangas = capangas;
    }

}