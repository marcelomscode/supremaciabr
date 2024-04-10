package com.mscode.services;

import com.mscode.entity.Videos;
import com.mscode.repositories.VideosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideosRepository videosRepository;

    public List<Videos> findAll() {
        return videosRepository.findAllByOrderByIdDesc();
    }

}
