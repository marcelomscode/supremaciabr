package com.mscode.dto;

public class MembrosDTO{


    private Integer idMembros;
    private Integer lider;
    private Integer comissarios;
    private Integer tenentes;
    private Integer representantes;
    private Integer capangas;


    public Integer getIdMembros() {
        return idMembros;
    }
    public Integer getLider() {
        return lider;
    }

    public void setIdMembros(Integer idMembros) {
        this.idMembros = idMembros;
    }

    public void setLider(Integer lider) {
        this.lider = lider;
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

    @Override
    public String toString() {
        return "MembrosDTO{" +
                "lider=" + lider +
                ", comissarios=" + comissarios +
                ", tenentes=" + tenentes +
                ", representantes=" + representantes +
                ", capangas=" + capangas +
                ", idMembros=" + idMembros +
                '}';
    }
}
