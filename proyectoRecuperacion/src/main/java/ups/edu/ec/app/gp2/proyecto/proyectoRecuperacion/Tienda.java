package ups.edu.ec.app.gp2.proyecto.proyectoRecuperacion;

import java.util.ArrayList;

public class Tienda {
	private int codigo;
	private String nombre;
	private String direccion;
	ArrayList <Usuario> usuario=new ArrayList<>(); 
	ArrayList <Comentario> comentario=new ArrayList<>();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(ArrayList<Comentario> comentario) {
		this.comentario = comentario;
	} 

	
}
