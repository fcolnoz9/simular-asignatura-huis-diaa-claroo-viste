package AgSistema;

import java.awt.Scrollbar;
import java.util.Vector;

import Recurso.Agente;
import Recurso.Notificacion;

import AgScrollbar.CScrollbar;
import AgTexto.CTexto;

public class CSistema implements Agente{
	private ASistema abstraccion;
	private PSistema presentacion;
	private Vector<Agente> subordinados;
	private CScrollbar scrollbar;
	private CScrollbar scrollbar2;
	private CTexto texto;
	
	public CSistema() {
		super();
		abstraccion = new ASistema(0, 10, 20);
		presentacion = new PSistema();
		AgregarAgentes();
		MostrarPresentacion();
	}
	
	public void Crear_Capturador_Datos_Invtervalo(){
		
	}

	private void MostrarPresentacion() {
		this.presentacion.setVisible(true);
		this.presentacion.setLocationRelativeTo(null);
	}

	private void AgregarAgentes() {
		this.subordinados = new Vector<Agente>();
		scrollbar = new CScrollbar(10, 20, 0,this);
		scrollbar2 = new CScrollbar(10, 20, 0,this);
		texto = new CTexto(0, 10, 20, this);
		this.subordinados.add(scrollbar);
		this.subordinados.add(scrollbar2);
		this.subordinados.add(texto);
		presentacion.getLienzo().add(scrollbar.getDibujo());
		scrollbar.getDibujo().setBounds(10, 10, this.getPresentacion().getLienzo().getWidth()-80, 50);
		presentacion.getLienzo().add(scrollbar2.getDibujo());
		scrollbar2.getDibujo().setOrientation(Scrollbar.VERTICAL);
		scrollbar2.getDibujo().setBounds(this.getPresentacion().getLienzo().getWidth()-60, 10, 50, this.getPresentacion().getLienzo().getHeight()-20);
		presentacion.getLienzo().add(texto.getPresentacion());
		texto.getPresentacion().setBounds(10, 70, scrollbar.getDibujo().getWidth(), scrollbar2.getDibujo().getHeight()-60);
	}

	public ASistema getAbstraccion() {
		return abstraccion;
	}

	public PSistema getPresentacion() {
		return presentacion;
	}

	@Override
	public void Recibir_Notificacion(Agente agente,Notificacion notificacion) {
		Comunicar_Cambios(agente,notificacion);
	}

	private void Comunicar_Cambios(Agente agente,Notificacion notificacion) {
		for(int i=0;i<this.subordinados.size();i++){
			Enviar_Notificacion(this.subordinados.get(i), notificacion);
		}
	}

	@Override
	public void Enviar_Notificacion(Agente agente,Notificacion notificacion) {
		agente.Recibir_Notificacion(this, notificacion);
	}
}
