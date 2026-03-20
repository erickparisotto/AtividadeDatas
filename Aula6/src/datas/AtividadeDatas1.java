package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AtividadeDatas1 {
	
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		SimpleDateFormat diaSemana = new SimpleDateFormat("EEEE");
		DateFormat data = DateFormat.getDateInstance(DateFormat.LONG);
		Date data1= new Date();
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);

		System.out.printf("Hoje é " + diaSemana.format(data1) + ", dia "+ data.format(data1)
			+ " e agora são %d horas e %d minutos.", hora, minutos);
	}
}
