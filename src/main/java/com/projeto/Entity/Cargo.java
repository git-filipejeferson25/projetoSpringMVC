package com.projeto.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

@Entity
@Table(name = "CARGO")
@Data
public class Cargo extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

	public List<Cargo> getFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}


}
