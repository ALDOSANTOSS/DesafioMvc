package com.gft.desafiomvc.dao;

import com.gft.desafiomvc.domain.Evento;
import org.springframework.stereotype.Repository;

@Repository
public class EventoDaompl extends AbstractDao <Evento,Long> implements EventoDao{
}