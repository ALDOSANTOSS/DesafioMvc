package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.models.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository  extends JpaRepository<Atividade, Long> {


}
