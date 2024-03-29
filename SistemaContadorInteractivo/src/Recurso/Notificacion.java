//Integrantes:
// Santana, Adriana CI: 18.801.197
// Paez, Maria CI: 19.618.874
// Arteaga, Luis CI: 19.696.160
// Colmenarez, Fernando CI: 18.923.926 
package Recurso;

public class Notificacion {
	private int tipo;
	private int nueva_posicion;
	public static final int INCREMENTAR=1;
	public static final int DECREMENTAR=2;
	public static final int TRACK=5;
	public static final int INCREMENTAR_BLOQUE=3;
	public static final int DECREMENTAR_BLOQUE=4;
	public static final int POCISIONAR=9;
	
	public Notificacion() {
		super();
	}

	public Notificacion(int tipo) {
		super();
		this.tipo = tipo;
	}

	public int getNueva_posicion() {
		return nueva_posicion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setNueva_posicion(int nueva_pocision) {
		this.nueva_posicion = nueva_pocision;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
