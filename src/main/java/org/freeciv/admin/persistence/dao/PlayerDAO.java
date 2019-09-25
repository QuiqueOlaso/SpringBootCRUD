package org.freeciv.admin.persistence.dao;

import java.util.List;

import org.freeciv.admin.persistence.pojos.Player;

// TODO: Auto-generated Javadoc
/**
 * The Interface PlayerDAO.
 */
public interface PlayerDAO {

	/**
	 * Adds the player.
	 *
	 * @param player the player
	 */
	public void addPlayer(Player player);

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	public List<Player> getPlayers();

	/**
	 * Delete player.
	 *
	 * @param id the id
	 */
	public void deletePlayer(int id);

	/**
	 * Delete player.
	 *
	 * @param player the player
	 */
	public void deletePlayer(Player player);

	/**
	 * Update player.
	 *
	 * @param player the player
	 */
	public void updatePlayer(Player player);

	/**
	 * Gets the player.
	 *
	 * @param id the id
	 * @return the player
	 */
	public Player getPlayer(int id);

}
