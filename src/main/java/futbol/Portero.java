package futbol;

public class Portero extends Futbolista  {
	public short golesRecibidos;
	public byte dorsal;
	public final String posicion = "Portero";
	
	
	
	public Portero() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Portero(String nombre, int edad,short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}


	 @Override
	public String toString(){
		return  "El futbolista "+this.nombre+" tiene "+this.edad+ ", y juega de"+this.posicion	+" con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;
		
	}	

	
	@Override
	public int compareTo(Object o) {
		return this.golesRecibidos - ((Portero)o).golesRecibidos;
	}
	
	public boolean jugarConLasManos() {
		
		return true;
	}
	
}
