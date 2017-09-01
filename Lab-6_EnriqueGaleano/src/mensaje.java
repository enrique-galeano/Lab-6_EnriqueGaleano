/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class mensaje {
	private String mensaje;
	private int estado;

	public mensaje() {
	}

	public mensaje(String mensaje, int estado) {
		this.mensaje = mensaje;
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}	

	@Override
	public String toString() {
		return "mensaje{" + "mensaje=" + mensaje + ", estado=" + estado + '}';
	}
	
}
