package org.freeciv.admin.persistence.dao;

import java.util.List;

import org.freeciv.admin.persistence.pojos.Player;

// TODO: Auto-generated Javadoc
/**
 * The Interface PlayerDAO.
 */
public interface PlayerDAO {

	/**
	 * Save.
	 *
	 * @param entity the entity
	 */
	void save(Player entity);

	/**
	 * Removes the.
	 *
	 * @param entity the entity
	 */
	void remove(Player entity);

	/**
	 * List.
	 *
	 * @return the list
	 */
	List<Player> list();

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Player> findAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the player
	 */
	Player findById(Integer id);

	/**
	 * Find by similar name.
	 *
	 * @param name the name
	 * @return the list
	 */
	List<Player> findBySimilarName(String name);

}
