package com.gft.desafiomvc.dao;

import com.gft.desafiomvc.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaompl extends AbstractDao<Usuario,Long> implements UsuarioDao{
}
