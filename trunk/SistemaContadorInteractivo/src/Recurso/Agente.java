//Integrantes:
// Santana, Adriana CI: 18.801.197
// Paez, Maria CI: 19.618.874
// Arteaga, Luis CI: 19.696.160
// Colmenarez, Fernando CI: 18.923.926 
package Recurso;

public interface Agente {
	public void Enviar(Notificacion notificacion,Agente receptor);
	public void Recibir(Notificacion notificacion,Agente eminsor);
}
