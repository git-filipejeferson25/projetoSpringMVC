package com.projeto.Entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "FUNCIONARIO")
@Data
public class Funcionario extends AbstractEntity<Long> {

    @NotBlank
    @Size( min=3, max=255)
    @Column(name = "Cargo", nullable = false, unique = true, length = 60)
    private String nome;

    @NotNull
    @NumberFormat(style = NumberFormat.Style.CURRENCY, pattern = "#,##0.00")
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private Double salario;

    @NotNull
    @PastOrPresent(message = "{PastOrPresent.funcionario.dataEntrada}")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "Data_Entrada", nullable = false, columnDefinition = "DATE")
    private LocalDate dataEntrada;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "Data_Saida", columnDefinition = "DATE")
    private LocalDate dataSaida;

    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Endereco_Id")
    private String endereco;

    @ManyToOne
    @JoinColumn(name = "Cargo_Id")
    private String cargo;


	public LocalDate getDataEntrada() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getDataSaida() {
		// TODO Auto-generated method stub
		return null;
	}


}
