package org.freeciv.admin.persistence.services;

import java.util.List;

import org.freeciv.admin.persistence.dao.PlayerDAORepository;
import org.freeciv.admin.persistence.pojos.Player;

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
	 * @param id the id
	 * @return the player
	 */
	@Override
	@Transactional
	public Player getPlayer(Long id) {
		Player todo = dao.findOne(id);
		return todo;
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
	 * @param id the id
	 */
	@Override
	@Transactional
	public void deletePlayer(long id) {
		dao.delete(id);
	}

	/**
	 * Delete player.
	 *
	 * @param t the t
	 */
	@Override
	@Transactional
	public void deletePlayer(Player t) {
		dao.delete(t);
	}

}
