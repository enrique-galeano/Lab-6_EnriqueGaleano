
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class persona {
	private String nombre;
	private String apellido;
	private String correo;
	private String fecha;
	private String pais;
	private int numeroTele;
	private String contra;
	private ArrayList<mensaje> mensaje = new ArrayList();

	public persona() {
	}

	public persona(String nombre, String apellido, String correo, String fecha, String pais, int numeroTele, String contra) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fecha = fecha;
		this.pais = pais;
		this.numeroTele = numeroTele;
		this.contra = contra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getNumeroTele() {
		return numeroTele;
	}

	public void setNumeroTele(int numeroTele) {
		this.numeroTele = numeroTele;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public ArrayList<mensaje> getMensaje() {
		return mensaje;
	}

	public void setMensaje(ArrayList<mensaje> mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", fecha=" + fecha + ", pais=" + pais + ", numeroTele=" + numeroTele + ", contra=" + contra + '}';
	}
	
	
}
