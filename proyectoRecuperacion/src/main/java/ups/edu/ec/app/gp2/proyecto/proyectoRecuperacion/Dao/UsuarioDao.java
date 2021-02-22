package ups.edu.ec.app.gp2.proyecto.proyectoRecuperacion.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.app.gp2.proyecto.proyectoRecuperacion.Usuario;



public class UsuarioDao {
	@PersistenceContext 
	private EntityManager em;
	
	
	public void insertUsuario(Usuario usuario) {
		em.persist(usuario);
	}

	public void removeUsuario(String cedula) throws Exception {
		em.remove(this.buscarUsuario(cedula));
	}
	
	public void update(Usuario usuario) throws Exception {
		em.merge(usuario);
	}

	public Usuario buscarUsuario(String cedula) {
		Usuario usuario = em.find(Usuario.class, cedula);
		return usuario;
	}
	public List<Usuario> getUsuarios(){
		String jpql = "SELECT u FROM Usuario u";
		Query query = em.createQuery(jpql, Usuario.class);
		List<Usuario> listado =  query.getResultList();	
		return listado;
	}

}
