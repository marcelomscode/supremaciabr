package com.mscode.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "videos")
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVideos;
    private String url;
    private String titulo;
    private String subTitulo;
    private String nomeImage;


    @Transient
    private String postadoEmTrans;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postadoEm;

    public Long getIdVideos() {
        return idVideos;
    }

    public void setIdVideos(Long idVideos) {
        this.idVideos = idVideos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getNomeImage() {
        return nomeImage;
    }

    public void setNomeImage(String nomeImage) {
        this.nomeImage = nomeImage;
    }

    public String getPostadoEmTrans() {
        return postadoEmTrans;
    }

    public void setPostadoEmTrans(String postadoEmTrans) {
        this.postadoEmTrans = postadoEmTrans;
    }

    public Date getPostadoEm() {
        return postadoEm;
    }

    public void setPostadoEm(Date postadoEm) {
        this.postadoEm = postadoEm;
    }

}



