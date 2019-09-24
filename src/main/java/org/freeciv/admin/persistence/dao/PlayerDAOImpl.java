package org.freeciv.admin.persistence.dao;

import java.util.List;

import org.freeciv.admin.persistence.pojos.Player;
import org.freeciv.admin.persistence.utils.HibernateUtil;
import org.hibernate.Session;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerDAOImpl.
 */
public class PlayerDAOImpl implements PlayerDAO {

	/** The session. */
	Session session;

	/**
	 * Instantiates a new player DAO impl.
	 */
	public PlayerDAOImpl() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	/**
	 * Save.
	 *
	 * @param player the player
	 */
	public void save(Player player) {
		session.beginTransaction();
		session.saveOrUpdate(player);
		session.getTransaction().commit();
		session.close();

	}

	/**
	 * Removes the.
	 *
	 * @param player the player
	 */
	public void remove(Player player) {
		session.beginTransaction();
		session.delete(player);
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the player
	 */
	public Player findById(Integer id) {
		return null;
	}

	/**
	 * Find by similar name.
	 *
	 * @param name the name
	 * @return the list
	 */
	public List<Player> findBySimilarName(String name) {
		return list();
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	public List<Player> findAll() {
		return list();
	}

	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<Player> list() {
		List<Player> player = session.createCriteria(Player.class).list();
		session.close();
		return player;
	}

}
