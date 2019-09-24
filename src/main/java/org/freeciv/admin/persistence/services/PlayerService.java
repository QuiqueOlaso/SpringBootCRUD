package org.freeciv.admin.persistence.services;

import java.util.List;

import org.freeciv.admin.persistence.pojos.Player;

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
	 */
	public void updatePlayer(Player t);
	
	/**
	 * Removes the player.
	 *
	 * @param id the id
	 */
	public void removePlayer(Player t);

	/**
	 * Gets the todo.
	 *
	 * @param id the id
	 * @return the todo
	 */
	public Player getTodo(Long id);

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	public List<Player> getAllPlayers();

	/**
	 * Delete player.
	 *
	 * @param id the id
	 */
	public void deletePlayer(long id);

}
