package codigo;

import java.util.ArrayList;
import java.util.List;

public class FormatoAmigable {
	static public void duracion(int segundos) {
		if(segundos == 0) {
			System.out.println("ahora");
			return;
		}
		
		final double SEG = 60;
		final double MIN = 60;
		final double HORA_EN_SEG = 3600;
		final int SEG_PER_YEAR = 31536000;
		final int SEG_PER_DAY = 86400;
		
		int horas = (int) (segundos / HORA_EN_SEG) % 24;
		int dias = (segundos / SEG_PER_DAY) % 365;
		int years = segundos / SEG_PER_YEAR;
		int minutos = (int) ((((segundos / HORA_EN_SEG) - horas) * MIN) % MIN);
		int seg = (int) (segundos % SEG);
		
		List<String> cadena = new ArrayList<>();
		
		if(years > 0)
			cadena.add(years > 1 ? years + " años" : years + " año");
		
		if(dias > 0)
			cadena.add(dias > 1 ? dias + " dias" : dias + " dia");
		
		if(horas > 0)
			cadena.add(horas > 1 ? horas + " horas" : horas + " hora");
		
		if(minutos > 0)
			cadena.add(minutos > 1 ? minutos + " minutos" : minutos + " minuto");
			
		if(seg > 0)
			cadena.add(seg > 1 ? seg + " segundos" : seg + " segundo");
		
		String formato = "";
		
		for(int i = 0; i < cadena.size() - 1; i ++)
			formato += i < cadena.size() - 2 ? cadena.get(i) + ", ": cadena.get(i) + " y ";
		
		formato += cadena.get(cadena.size() - 1);
		System.out.println(formato);
	}
}