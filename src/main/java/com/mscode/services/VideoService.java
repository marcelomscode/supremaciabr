package com.mscode.services;

import com.mscode.entity.Videos;
import com.mscode.repositories.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideosRepository videosRepository;

    public List<Videos> findAll() {
        return videosRepository.findAllByOrderByIdDesc();
    }

    public List<Videos> listaUltimosVideo(){
//        TypedQuery<Videos> videos = manager.createQuery("from Videos order by idVideos desc", Videos.class);
////        return videos.getResultList();
        return videosRepository.findFirst3ByOrderByidVideosDesc();
    }

    public void salvaVideo(Videos videos){
        try {

            SimpleDateFormat formatEntrada = new SimpleDateFormat("yyyy-MM-dd");
            Date data = formatEntrada.parse(videos.getPostadoEmTrans());

           videos.setPostadoEm(data);
            videosRepository.save(videos);
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void editaVideo(Videos videos){
        try {
            videos.setPostadoEm(converteData(videos.getPostadoEmTrans()));
            videosRepository.save(videos);
        } catch (Exception e) {
            e.getCause();
        }
    }

    public void removeVideo(Long idVideos){
        try {
            Videos video =	videosRepository.findById(idVideos).orElseThrow();
            videosRepository.delete(video);
        } catch (Exception e) {
            e.getCause();
        }
    }


    private static java.sql.Date converteData(String dataConverter) throws ParseException {
        // Defina o formato de entrada da data
        SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
        // Analise a data de entrada
        Date data = formatEntrada.parse(dataConverter);


        SimpleDateFormat formatSaida = new SimpleDateFormat("yyyy-MM-dd");
        // Converta a data para o formato desejado
        String dataFormatada = formatSaida.format(data);
        // Crie um objeto java.sql.Date se precisar
        java.sql.Date dataSql = new java.sql.Date(data.getTime());
        return dataSql;
    }


}
