package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	private final String posicion = "portero";
	
	
	
	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Portero(String nombre, int edad,short golesRecibidos, byte dorsal) {
		super(nombre, edad, "portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}


	 @Override
	public String toString(){
		return "El futbolista "+this.nombre+" tiene "+this.edad+ ", y juega de "+this.posicion+" con el dorsal "+this.dorsal + "";
		
	}

	
	@Override
	public int compareTo(Object o) {
		return this.edad - ((Jugador)o).edad;
	}
	
	public boolean jugarConLasManos() {
		
		return true;
	}
	
}
