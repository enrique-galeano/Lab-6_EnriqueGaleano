
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class AdministrarPersonas {

	private ArrayList<persona> listaPersona = new ArrayList();
	private File archivo = null;

	public AdministrarPersonas(String path) {
		archivo = new File(path);
	}

	public ArrayList<persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(ArrayList<persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	@Override
	public String toString() {
		return "AdministrarPersonas{" + "listaPersona=" + listaPersona + '}';
	}

	public void EscribirArchivo() throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(archivo, false);
			bw = new BufferedWriter(fw);
			for (persona p : listaPersona) {
				bw.write(p.getNombre() + ";");
				bw.write(p.getApellido() + ";");
				bw.write(p.getCorreo() + ";");
				bw.write(p.getFecha() + ";");
				bw.write(p.getPais() + ";");
				bw.write(p.getNumeroTele() + ";");
				bw.write(p.getContra() + ";");
				for (mensaje h : p.getMensaje()) {
					bw.write(h.getEstado() + ".");
					bw.write(h.getMensaje() + ".");
				}
				bw.write(";");
			}
			bw.flush();
			bw.close();
			fw.close();
		} catch (Exception e) {
		}

	}

	public void CargarArchivo() {
		Date d1 = new Date();
		SimpleDateFormat format =  new SimpleDateFormat("dd/MMMM/yyyy");
		if (archivo.exists()) {
			Scanner sc = null;
			listaPersona = new ArrayList();
			try {
				sc = new Scanner(archivo);
				sc.useDelimiter(";");
				while (sc.hasNext()) {
					String nombre, apellido, correo;
					
					String fecha;
					String pais;
					int tele;
					String contra;
						
					ArrayList<mensaje> pj = new ArrayList();
					nombre = sc.next();
					apellido = sc.next();
					correo = sc.next();
					fecha = sc.next();
					pais = sc.next();
					tele= sc.nextInt();
					contra = sc.next();		
					Scanner s2 = new Scanner(sc.next());
					s2.useDelimiter(".");
					while (s2.hasNext()) {						
						pj.add(new mensaje(sc.next(), sc.nextInt()));
					}
					
					listaPersona.add(new persona(nombre, apellido, correo,fecha,pais,tele, contra));
					System.out.println(listaPersona.size());
//listaPersona.get((listaPersona.size()-1)).setMensaje(pj);
				}
				sc.close();
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}

}
