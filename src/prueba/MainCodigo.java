package prueba;

import codigo.FormatoAmigable;

public class MainCodigo {

	public static void main(String[] args) {
		FormatoAmigable.duracion(0);
		FormatoAmigable.duracion(60);
		FormatoAmigable.duracion(62);
		FormatoAmigable.duracion(3600);
		FormatoAmigable.duracion(4000);
		FormatoAmigable.duracion(86400);
		FormatoAmigable.duracion(86400 * 2 + 59);
		FormatoAmigable.duracion(96500);
		FormatoAmigable.duracion(31536000);
		FormatoAmigable.duracion(1000000000);
	}

}
