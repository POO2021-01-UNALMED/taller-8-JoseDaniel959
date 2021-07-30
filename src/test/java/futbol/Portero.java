package futbol;

public class Portero extends Futbolista {
	short golesRecibidos;
	byte dorsal;
	final String posicion = "portero";
	
	
	
	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Portero(String nombre, int edad, String posicion,short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}



	public String toString(){
		return "El futbolista "+this.nombre+" tiene "+this.edad+ ", y juega de "+this.posicion+" con el dorsal "+this.dorsal + "";
		
	}

	
	@Override
	public int compareTo(Futbolista o) {
		return this.edad - o.edad;
	}
	
	public boolean jugarConLasManos() {
		
		return true;
	}
	
}
