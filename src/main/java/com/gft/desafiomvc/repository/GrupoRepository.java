package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {


}
