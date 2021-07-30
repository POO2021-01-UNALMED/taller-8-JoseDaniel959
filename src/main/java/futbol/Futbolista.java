package futbol;


public abstract class  Futbolista implements  Comparable<Object> {
	protected String nombre;
	protected int edad;
	protected final String posicion;
	
	
	public Futbolista(){
		
		this.nombre = "Maradona";
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
		if(this.nombre == f.nombre && this.edad ==  f.edad && this.posicion == f.posicion){
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



	public int compareTo(Object o) {
		return 0;
	}
	
}