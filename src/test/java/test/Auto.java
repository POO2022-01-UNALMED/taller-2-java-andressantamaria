package test;


public class Auto {
	public String modelo;
	public int precio;
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	//método que verifica la cantidad de objetos asientos creados
	public int cantidadAsientos() {
		
		int seats = 0;
		for (int i = 0;i < asientos.length; i++ ) {
			if (asientos[i] instanceof Asiento) {
				seats++;
			}
		}
			
		return seats;	
	}
	
	//método que verifica la integridad de los números de registro
	public String verificarIntegridad() {
		if (this.motor.registro == this.registro) {
			for(int i = 0; i < asientos.length; i++) {
				if(asientos[i] != null) {
					if (asientos[i].registro != this.registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
		
	}
	
}
