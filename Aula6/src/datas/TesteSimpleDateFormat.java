package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteSimpleDateFormat {

	public static void main(String[] args) {	
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/y HH:mm:ss");
			
		Date data1= new Date();

		System.out.println("Data formato padrão = " + data1);
		System.out.println("Data formato Simples 1 = "+sdf1.format(data1));
		System.out.println("Data formato Simples 2 = "+sdf2.format(data1));	

	}
}
