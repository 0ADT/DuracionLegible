package prueba;

import codigo.FormatoAmigable;

public class MainCodigo {

	public static void main(String[] args) {
		FormatoAmigable.duracion(0);// ahora
		FormatoAmigable.duracion(60);// 1 minuto
		FormatoAmigable.duracion(62);// 1 minuto y 2 segundos
		FormatoAmigable.duracion(3600);// 1 hora
		FormatoAmigable.duracion(4000);// 1 hora, 6 minutos y 40 segundos
		FormatoAmigable.duracion(86400);// 1 dia
		FormatoAmigable.duracion(86400 * 2 + 59);// 2 dias y 59 segundos
		FormatoAmigable.duracion(96500);// 1 dia, 2 horas, 48 minutos y 20 segundos
		FormatoAmigable.duracion(31536000);// 1 año
		FormatoAmigable.duracion(1000000000);// 31 años, 259 dias, 1 hora, 46 minutos y 40 segundos
	}

}
