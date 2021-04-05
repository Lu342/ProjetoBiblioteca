package com.br.educ.fafic.pi.dto;

import com.br.educ.fafic.pi.domain.Livro;
import com.br.educ.fafic.pi.domain.Usuarios;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Calendar;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movimentacao_DTO {

    private Usuarios usuario;

    private Calendar dataEmprestimo;

    private Calendar dataDevolucao;

    private List<Livro> livrosAlocados;

    private Double multa;

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public List<Livro> getLivrosAlocados() {
        return livrosAlocados;
    }

    public void setLivrosAlocados(List<Livro> livrosAlocados) {
        this.livrosAlocados = livrosAlocados;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }
}
