package datas;

import java.time.LocalDate;
import java.time.Period;

public class TesteLocalDate {
public static void main(String[] args) {	
		
		LocalDate primeiraData = LocalDate.of(2026, 1, 1);
		LocalDate segundaData = LocalDate.of(2026, 3, 11);
		
		Period periodo = Period.between(primeiraData, segundaData);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("A diferença é " + anos + " ano(s), " 
				+ meses + " mes(es) e "		
				+ dias + " dia(s). ");
			
	}
}
