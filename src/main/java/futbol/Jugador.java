package futbol;

public class Jugador extends Futbolista  {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		this.golesMarcados = 298;
		this.dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion,short golesMarcados,byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	
	
	public boolean jugarConLasManos() {
		
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.edad - ((Jugador)o).edad;
	}
	
	
	
	
	public String toString(){
		return "El futbolista "+this.nombre+ " tiene "+this.edad+ ", y juega de "+this.posicion+" con el dorsal "+this.dorsal+ ". Ha marcado "+ this.golesMarcados +"";
		
	}
	
	
	
}
