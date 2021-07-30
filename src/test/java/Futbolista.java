

public abstract class  Futbolista implements  Comparable<Futbolista> {
	String nombre;
	int edad;
	final String posicion;
	
	
	public Futbolista(){
		this.nombre = "nombre";
		this.edad = 30;
		this.posicion = "delantero";
	}
	
	
	
	public Futbolista(String nombre,int edad,String posicion){
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	
	public String toString(){
		return "El futbolista "+ this.nombre +" tiene "+this.edad+ ", y juega de "+ this.posicion;
	}
	
	public boolean equals(Futbolista f){
		boolean b = false;
		if(this.nombre == f.nombre){
			b = true;
		}
		return b;
	}
	
	public abstract boolean jugarConLasManos();
		
		
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getPosicion() {
		return posicion;
	}



	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
