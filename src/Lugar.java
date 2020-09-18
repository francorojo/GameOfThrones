
//@Estrategia(JOIN)
public abstract class Lugar {

	//Si las lugares se pueden repetir se pone un id
	//Si son nombres unicos puede ir sin id
	
	//Elegimos una estrategia Join en base al dominio que no van a variar los tipos de lugar
	
	TipoLugar tipo;
	
	String nombre;
	Integer anioFundacion;
	Integer poblacion;

	protected String nombreLugar() {
		return nombre;
	}

	protected TipoLugar tipo() {
		return tipo;
	}
	
}