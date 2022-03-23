package test;

public class Motor {
	
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	//método que cambia el registro
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	//método que asigna el tipo
	public void asignarTipo(String tipo) {
		if(tipo.equals("electrico") || tipo.equals("gasolina")) { 
			this.tipo = tipo;
		}		
	}

}
