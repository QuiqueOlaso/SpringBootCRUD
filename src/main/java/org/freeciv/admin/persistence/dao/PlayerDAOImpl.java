package org.freeciv.admin.persistence.dao;

import java.util.List;

import org.freeciv.admin.persistence.domain.Player;
import org.freeciv.admin.persistence.domain.PlayerId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerDAOImpl.
 */
@Repository("playerDAO")
public class PlayerDAOImpl implements PlayerDAO {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Sets the session factory.
	 *
	 * @param sessionFactory the new session factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Adds the player.
	 *
	 * @param player the player
	 */
	@Override
	public void addPlayer(Player player) {
		Session session = sessionFactory.getCurrentSession();
		session.save(player);
	}

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	@Override
	public List<Player> getPlayers() {
		Session session = sessionFactory.getCurrentSession();
		List<Player> list = session.createQuery("from players").list();
		return list;
	}

	/**
	 * Delete player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 */
	@Override
	public void deletePlayer(String name, String hostport) {
		PlayerId playerId = new PlayerId(name, hostport);
		deletePlayer(playerId);
	}

	/**
	 * Delete player.
	 *
	 * @param playerId the player id
	 */
	@Override
	public void deletePlayer(PlayerId playerId) {
		Session session = sessionFactory.getCurrentSession();
		Player player = session.load(Player.class, playerId);
		if (player != null) {
			session.delete(player);
		}
	}

	/**
	 * Delete player.
	 *
	 * @param player the player
	 */
	@Override
	public void deletePlayer(Player player) {
		Session session = sessionFactory.getCurrentSession();
		if (player != null) {
			session.delete(player);
		}
	}

	/**
	 * Update player.
	 *
	 * @param player the player
	 */
	@Override
	public void updatePlayer(Player player) {
		Session session = sessionFactory.getCurrentSession();
		session.update(player);
	}

	/**
	 * Gets the player.
	 *
	 * @param playerId the id
	 * @return the player
	 */
	@Override
	public Player getPlayer(PlayerId playerId) {
		Session session = sessionFactory.getCurrentSession();
		Player player = (Player) session.get(Player.class, playerId);
		return player;
	}

	/**
	 * Gets the player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 * @return the player
	 */
	@Override
	public Player getPlayer(String name, String hostport) {
		PlayerId playerId = new PlayerId(name, hostport);
		return getPlayer(playerId);
	}

}
