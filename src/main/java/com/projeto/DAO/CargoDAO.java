package com.projeto.DAO;

import com.projeto.Entity.Cargo;
import com.projeto.PaginacaoUtil.PaginacaoUtil;

import java.util.List;

public interface CargoDAO {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
