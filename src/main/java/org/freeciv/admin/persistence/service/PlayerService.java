package org.freeciv.admin.persistence.service;

import java.util.List;

import org.freeciv.admin.persistence.domain.Player;
import org.freeciv.admin.persistence.domain.PlayerId;

// TODO: Auto-generated Javadoc
/**
 * The Interface PlayerService.
 */
public interface PlayerService {

	/**
	 * Adds the player.
	 *
	 * @param t the t
	 * @return the player
	 */
	public Player addPlayer(Player t);

	/**
	 * Update player.
	 *
	 * @param t the t
	 * @return the player
	 */
	public Player updatePlayer(Player t);

	/**
	 * Gets the player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 * @return the player
	 */
	public Player getPlayer(String name, String hostport);

	/**
	 * Gets the player.
	 *
	 * @param playerId the player id
	 * @return the player
	 */
	Player getPlayer(PlayerId playerId);

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	public List<Player> getAllPlayers();

	/**
	 * Delete player.
	 *
	 * @param t the t
	 */
	void deletePlayer(Player player);

	/**
	 * Delete player.
	 *
	 * @param playerId the player id
	 */
	void deletePlayer(PlayerId playerId);

	/**
	 * Delete player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 */
	void deletePlayer(String name, String hostport);

}
