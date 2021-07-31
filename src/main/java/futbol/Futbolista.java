package futbol;


public  class  Futbolista implements  Comparable<Object> {
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
	
	 @Override
	public String toString(){
		
		return "El futbolista "+ this.nombre +" tiene "+this.edad+ ", y juega de "+ this.posicion;
	}
	
	/*public boolean equals(Futbolista f){
		boolean b = false;
		if(this.nombre == f.nombre && this.edad ==  f.edad && this.posicion == f.posicion){
			return true;
		}
		return b;
	}*/
	
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
		
		
	
	
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
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void main(String args[])  //static method  
	{ 
	
	Futbolista f1 = new Futbolista();
	Futbolista f2 = new Futbolista();
	Futbolista f3 = f1;
	System.out.println(!f1.equals(f2) );  
	}  
	
}
