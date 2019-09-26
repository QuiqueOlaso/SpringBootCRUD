package org.freeciv.admin.persistence.services;

import java.util.List;

import org.freeciv.admin.persistence.dao.PlayerDAORepository;
import org.freeciv.admin.persistence.pojos.Player;
import org.freeciv.admin.persistence.pojos.PlayerId;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerServiceImpl.
 */
@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	/** The dao. */
	@Autowired
	PlayerDAORepository dao;

	/**
	 * Adds the player.
	 *
	 * @param t the t
	 * @return the player
	 */
	@Override
	@Transactional
	public synchronized Player addPlayer(Player t) {
		dao.save(t);
		return t;
	}

	/**
	 * Update player.
	 *
	 * @param t the t
	 * @return the player
	 */
	@Override
	@Transactional
	public Player updatePlayer(Player t) {
		dao.save(t);
		return t;
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

	/**
	 * Gets the player.
	 *
	 * @param playerId the player id
	 * @return the player
	 */
	@Override
	@Transactional
	public Player getPlayer(PlayerId playerId) {
		Player player = dao.findOne(playerId);
		return player;
	}

	/**
	 * Gets the all players.
	 *
	 * @return the all players
	 */
	@Override
	@Transactional
	public List<Player> getAllPlayers() {
		List<Player> todoList = new ArrayList<>();
		dao.findAll().forEach(e -> todoList.add(e));
		return todoList;
	}

	/**
	 * Delete player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 */
	@Override
	@Transactional
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
	@Transactional
	public void deletePlayer(PlayerId playerId) {
		Player player = getPlayer(playerId);
		deletePlayer(player);
	}

	/**
	 * Delete player.
	 *
	 * @param player the player
	 */
	@Override
	@Transactional
	public void deletePlayer(Player player) {
		dao.delete(player);
	}

}
