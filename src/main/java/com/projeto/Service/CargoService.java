package com.projeto.Service;

import com.projeto.Entity.Cargo;
import com.projeto.PaginacaoUtil.PaginacaoUtil;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
    boolean cargoTemFuncionarios(Long id);
    PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
