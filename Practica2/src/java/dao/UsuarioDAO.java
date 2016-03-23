package dao;

import org.hibernate.Query;
import org.hibernate.Session;

import model.Usuario;
import utilh.HibernateUtil;

public class UsuarioDAO {

	private Session session;

	public Usuario verificarDatos(Usuario usuario) throws Exception {
		Usuario us = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			String hql = "FROM Usuario WHERE nombre = '" + usuario.getNombre()
					+ "' and contrasenia = '" + usuario.getContrasenia() + "'";
			Query query = session.createQuery(hql);
			if (!query.list().isEmpty())
				us = (Usuario) query.list().get(0);			

		} catch (Exception e) {
			throw e;
		}

		return us;
	}
}