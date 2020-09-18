import java.util.List;
import java.util.Set;

public class Region {

	//Si las regiones se pueden repetir se pone un id
	//Si son nombres unicos puede ir sin id
	
	//@Id
	String nombre;
		
	//@ManyToMany
	Set<Lugar> lugares;
	
	//@ManyToOne
	Casa casaPrincipal;
	
	Set<Lugar> castillos() {
		return (Set<Lugar>) lugares.stream().filter(lugar -> lugar.tipo() == TipoLugar.Castillo);
	}
}

//Tanto las casas como las regiones implementan una interfaz Fundable, que
//permite tratarlas polimórficamente según el mensaje añoFundacion()
//Como la interfaz no es utilizada, se podria implementar asi
//Sino la convertiriamos a clase abstacta para poder persistirla