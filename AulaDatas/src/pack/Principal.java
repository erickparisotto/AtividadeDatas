package pack;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//defino o formato da data com sdf
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		String nascimento = new String("");
		
		System.out.println("Digite sua data de nascimento: (dd/mm/aaaa)");
		nascimento = teclado.nextLine();
		
		try {
			//tento pegar a string e transformar em Date
			Date nascimentoDate = sdf.parse(nascimento);
			
			//transformo o Date para LocalDate
			LocalDate nascimentoLocalDate = nascimentoDate.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
			
			calcularIdade(nascimentoLocalDate);
			
		} catch(Exception e) {
			System.out.println("Data inválida, tente novamente!");
		}
		
		teclado.close();
	}
	
	public static void calcularIdade(LocalDate dataNascimento) {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		
		int diasTotal= periodo.getDays();
		int mesesTotal = periodo.getMonths();
		int anosTotal = periodo.getYears();
		
		System.out.println("Você tem " + anosTotal + " ano(s), " 
				+ mesesTotal + " mes(es) e "		
				+ diasTotal + " dia(s) de vida.");
		
		//parte que mostra se for seu aniversário
		if((diasTotal == 0) && (mesesTotal == 0)) {
			System.out.println("Hoje é seu aniversário, parábens!");
		}
	}
}
