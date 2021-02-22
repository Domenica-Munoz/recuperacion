package ups.edu.ec.app.gp2.proyecto.proyectoRecuperacion.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ups.edu.ec.app.gp2.proyecto.proyectoRecuperacion.Comentario;


public class ComentarioDao {
	
	
	@PersistenceContext 
	private EntityManager em;
	
	
	public void insertComentario(Comentario comentario) {
		em.persist(comentario);
	}

	public void removeComentario(String usuario) throws Exception {
		em.remove(this.buscarComentario(usuario));
	}
	
	public void update(Comentario comentario) throws Exception {
		em.merge(comentario);
	}

	public Comentario buscarComentario(String usuario) {
		Comentario comentario = em.find(Comentario.class, usuario);
		return comentario;
	}
	public List<Comentario> getComentarios(){
		String jpql = "SELECT c FROM Comentario c"
				+ "";
		Query query = em.createQuery(jpql, Comentario.class);
		List<Comentario> listado =  query.getResultList();	
		return listado;
	}
	

}
