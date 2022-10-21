package com.gft.desafiomvc.service;

import com.gft.desafiomvc.dao.AtividadeDao;
import com.gft.desafiomvc.domain.Atividade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class AtividadeServicempl implements AtividadeService {

    @Autowired
    private AtividadeDao dao;


    @Override
    public void salvar(Atividade atividade) {
        dao.save(atividade);


    }

    @Override
    public void editar(Atividade atividade) {
        dao.update(atividade);

    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Atividade bucarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Atividade> buscarTodos() {
        return dao.findAll();
    }

}
