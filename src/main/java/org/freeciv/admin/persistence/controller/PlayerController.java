package org.freeciv.admin.persistence.controller;

import java.util.List;

import org.freeciv.admin.persistence.pojos.Player;
import org.freeciv.admin.persistence.services.PlayerService;
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
	PlayerService service;

	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() {
		return "index";
	}

	/**
	 * Adds the player.
	 *
	 * @param player the t
	 * @return the player
	 */
	@RequestMapping(value = "/players/addPlayer", method = RequestMethod.POST, headers = "Accept=application/json")
	public Player addPlayer(@RequestBody Player player) {
		return service.addPlayer(player);
	}

	/**
	 * Update player.
	 *
	 * @param player the t
	 * @return the player
	 */
	@RequestMapping(value = "/players/updatePlayer", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Player updatePlayer(@RequestBody Player player) {
		service.updatePlayer(player);
		return player;
	}

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	@RequestMapping(value = "/players/getAllPlayers", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Player> getAllPlayers() {
		List<Player> playerList = service.getAllPlayers();
		return playerList;
	}

	/**
	 * Delete cust.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/players/deletePlayer/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCust(@PathVariable long id) {
		service.deletePlayer(id);
	}

}
