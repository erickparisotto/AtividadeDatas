package pack;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia que você nasceu: ");
		int dia = teclado.nextInt();
		System.out.println("Digite o mês que você nasceu: ");
		int mes = teclado.nextInt();
		System.out.println("Digite o ano que você nasceu: ");
		int ano = teclado.nextInt();
		
		calcularIdade(dia, mes, ano);
		
		teclado.close();
	}
	
	public static void calcularIdade(int dia, int mes, int ano) {
		LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		
		int diasTotal= periodo.getDays();
		int mesesTotal = periodo.getMonths();
		int anosTotal = periodo.getYears();
		
		System.out.println("Você tem " + anosTotal + " ano(s), " 
				+ mesesTotal + " mes(es) e "		
				+ diasTotal + " dia(s) de vida.");
	}
}
