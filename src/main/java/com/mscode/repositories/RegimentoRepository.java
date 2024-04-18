package com.mscode.repositories;

import com.mscode.entity.Regimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface RegimentoRepository extends JpaRepository<Regimento, Long> {


    @Query("SELECT r FROM Regimento r WHERE r.active = true ORDER BY r.idRegimento LIMIT 30")
    List<Regimento> findFirst3ByOrderByIdDesc();

    @Query("SELECT r FROM Regimento r WHERE r.active = true ORDER BY r.idRegimento")
    List<Regimento> findAllOrderByIdRegimento();
}
