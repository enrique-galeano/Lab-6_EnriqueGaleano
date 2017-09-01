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
	private String estado;

	public mensaje() {
	}

	public mensaje(String mensaje, String estado) {
		this.mensaje = mensaje;
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	

	@Override
	public String toString() {
		return "mensaje{" + "mensaje=" + mensaje + ", estado=" + estado + '}';
	}
	
}
