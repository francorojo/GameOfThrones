import java.util.List;

public class Casa {

	//Si las casas se pueden repetir se pone un id
	//Si son nombres unicos puede ir sin id
	
	//@OneToMany
	List<FuerzaMilitar> fuerzas;
	
	//@ManyToOne
	Casa vasallaDe;
	
	//@ManyToOne
	Lugar lugar; 
	
	String nombre;
	Integer patrimonio;
	Integer anioFundacion;
	
	String nombreLugarOrigen() {
		return lugar.nombreLugar();
	}
}
