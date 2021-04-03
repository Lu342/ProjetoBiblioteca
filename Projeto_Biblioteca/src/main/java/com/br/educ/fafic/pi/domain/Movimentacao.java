package com.br.educ.fafic.pi.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID uuid;

	@OneToOne
	private Usuarios usuario;
	
	private Calendar dataEmprestimo;
	private Calendar dataDevolucao;

	@OneToMany
	private List<Livro> livrosAlocados;
	private Double multa;
	public Double getMulta() {
		return multa;
	}
	public void setMulta(Double multa) {
		this.multa = multa;
	}
	
    private String getDatePC() {
	DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
	Date date = new Date();
	return dateFormat.format(date);
}
    /* Comparar duas datas em dias.
     * 
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1 = dataEmprestimo;
    String inputString2 = dataDevolucao;

    try {
        Date date1 = myFormat.parse(inputString1);
        Date date2 = myFormat.parse(inputString2);
        long diff = date2.getTime() - date1.getTime();
        System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    } catch (ParseException e) {
        e.printStackTrace();
    }
*/
    
    
//	 multa diária de 2,00 para cada dia (se tiver)
//   Usar o relógio do computador como base.
	
}
