package com.mscode.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "regimento")
public class Regimento {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idRegimento;
    private String titulo;
    @Size(min=10,max = 50, message="O campo 'tituloRegimento' deve ter entre 10 e 50 caracteres")
    private String tituloRegimento;
    @Size(min=10,max = 500, message="O campo 'subTituloDescricao' deve ter entre 50 e 100 caracteres")
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