package com.mscode.repositories;

import com.mscode.entity.Videos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideosRepository extends JpaRepository<Videos, Long> {

    @Query("SELECT v FROM Videos v ORDER BY v.idVideos DESC")
    public List<Videos> findAllByOrderByIdDesc();

    @Query("SELECT v FROM Videos v ORDER BY v.idVideos DESC LIMIT 3")
    List<Videos> findFirst3ByOrderByidVideosDesc() ;
}



