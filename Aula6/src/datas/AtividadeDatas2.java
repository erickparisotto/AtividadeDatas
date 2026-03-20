package datas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class AtividadeDatas2 {
	
	public static void main(String[] args) {
		contaTempo(04, 01, 2027);
	}

	public static void contaTempo(int diaFinal, int mêsFinal, int anoFinal) {
Calendar hoje = Calendar.getInstance();
		
		int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
		int mesAtual = hoje.get(Calendar.MONTH);
		int anoAtual = hoje.get(Calendar.YEAR);
		
		LocalDate primeiraData = LocalDate.of(anoAtual, mesAtual, diaAtual);
		LocalDate segundaData = LocalDate.of(anoFinal, mêsFinal, diaFinal);
		Period periodo = Period.between(primeiraData, segundaData);
		
		int diasRestantes = periodo.getDays();
		int mesesRestantes = periodo.getMonths();
		int anosRestantes = periodo.getYears();
		
		System.out.println("Faltam " + anosRestantes + " ano(s), " 
				+ mesesRestantes + " mes(es) e "		
				+ diasRestantes + " dia(s) para essa data em " + anoFinal +".");
	}
}
