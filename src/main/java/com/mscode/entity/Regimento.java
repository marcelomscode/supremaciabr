package com.mscode.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "regimento")
public class Regimento {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idRegimento;
    private String titulo;
    private String tituloRegimento;
    private String subTituloDescricao;
    private boolean active;

    public boolean isActive(boolean b) {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTituloRegimento() {
        return tituloRegimento;
    }
    public void setTituloRegimento(String tituloRegimento) {
        this.tituloRegimento = tituloRegimento;
    }
    public Integer getIdRegimento() {
        return idRegimento;
    }
    public void setIdRegimento(Integer idRegimento) {
        this.idRegimento = idRegimento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSubTituloDescricao() {
        return subTituloDescricao;
    }
    public void setSubTituloDescricao(String subTituloDescricao) {
        this.subTituloDescricao = subTituloDescricao;
    }
}