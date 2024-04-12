package com.mscode.repositories;

import com.mscode.entity.Regimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface RegimentoRepository extends JpaRepository<Regimento, Integer> {


    @Query("SELECT r FROM Regimento r ORDER BY r.idRegimento DESC LIMIT 3")
    List<Regimento> findFirst3ByOrderByIdDesc();

    @Query("SELECT r FROM Regimento r ORDER BY r.idRegimento")
    List<Regimento> findAllOrderByIdRegimento();
}
