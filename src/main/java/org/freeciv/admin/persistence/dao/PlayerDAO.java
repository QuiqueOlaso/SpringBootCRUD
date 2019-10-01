package org.freeciv.admin.persistence.dao;

import java.util.List;

import org.freeciv.admin.persistence.domain.Player;
import org.freeciv.admin.persistence.domain.PlayerId;

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
	 * @param name     the name
	 * @param hostport the hostport
	 */
	public void deletePlayer(String name, String hostport);

	/**
	 * Delete player.
	 *
	 * @param playerId the player id
	 */
	public void deletePlayer(PlayerId playerId);

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
	 * @param playerId the id
	 * @return the player
	 */
	public Player getPlayer(PlayerId playerId);

	/**
	 * Gets the player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 * @return the player
	 */
	public Player getPlayer(String name, String hostport);

}
