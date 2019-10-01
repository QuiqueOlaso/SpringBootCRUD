package org.freeciv.admin.persistence.controller;

import java.util.List;

import org.freeciv.admin.persistence.domain.Player;
import org.freeciv.admin.persistence.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerController.
 */
@RestController
public class PlayerController {

	/** The service. */
	@Autowired
	PlayerService playerService;

	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() {
		return "index-q";
	}

	/**
	 * Adds the player.
	 *
	 * @param player the t
	 * @return the player
	 */
	@RequestMapping(value = "/players/addPlayer", method = RequestMethod.POST, headers = "Accept=application/json")
	public Player addPlayer(@RequestBody Player player) {
		return playerService.addPlayer(player);
	}

	/**
	 * Update player.
	 *
	 * @param player the t
	 * @return the player
	 */
	@RequestMapping(value = "/players/updatePlayer", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Player updatePlayer(@RequestBody Player player) {
		playerService.updatePlayer(player);
		return player;
	}

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	@RequestMapping(value = "/players/getAllPlayers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Player> getAllPlayers() {
		List<Player> playerList = playerService.getAllPlayers();
		return playerList;
	}

	/**
	 * Delete cust.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/players/deletePlayer/{id}&{hostport}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deletePlayer(@PathVariable String name, @PathVariable String hostport) {
		playerService.deletePlayer(name, hostport);
	}

}
