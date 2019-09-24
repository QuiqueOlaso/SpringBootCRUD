package org.freeciv.admin.persistence.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.freeciv.admin.persistence.pojos.Player;
import org.freeciv.admin.persistence.services.PlayerService;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerBean.
 */
// @ManagedBean(name = "dtPlayerController")
@ManagedBean
@SessionScoped
public class PlayerBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8664535627974240648L;

	/** The player service. */
	@ManagedProperty(value = "#{playerService}")
	private PlayerService playerService;

	/** The player. */
	private Player player;

	/** The selected player. */
	private String selectedPlayer;

	/** The filtro player. */
	private String playerFilter;

	/** The lista de players. */
	private List<Player> playerList;

	/** The dirty. */
	private boolean dirty = false;

	/**
	 * Gets the player service.
	 *
	 * @return the service
	 */
	public PlayerService getPlayerService() {
		return playerService;
	}

	/**
	 * Sets the player service.
	 *
	 * @param playerService the new player service
	 */
	public void setPlayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Sets the player.
	 *
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * Gets the selected player.
	 *
	 * @return the selectedPlayer
	 */
	public String getSelectedPlayer() {
		return selectedPlayer;
	}

	/**
	 * Sets the selected player.
	 *
	 * @param selectedPlayer the selectedPlayer to set
	 */
	public void setSelectedPlayer(String selectedPlayer) {
		this.selectedPlayer = selectedPlayer;
	}

	/**
	 * Gets the playerFilter.
	 *
	 * @return the playerFilter
	 */
	public String getPlayerFilter() {
		return playerFilter;
	}

	/**
	 * Sets the playerFilter.
	 *
	 * @param playerFilter the playerFilter to set
	 */
	public void setPlayerFilter(String playerFilter) {
		this.playerFilter = playerFilter;
	}

	/**
	 * Gets the lista de players.
	 *
	 * @return the listaDePlayers
	 */
	public List<Player> getPlayerList() {
		return this.getPlayers();
	}

	/**
	 * Sets the lista de players.
	 *
	 * @param playerList the listaDePlayers to set
	 */
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	/**
	 * Crear player.
	 */
	public void newPlayer() {
		player = new Player();
	}

	/**
	 * actualizar.
	 *
	 * @param e the e
	 */
	public void editPlayer(ActionEvent e) {
		selectedPlayer = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
				.get("selectedPlayer");
		player = this.playerService.findById(Integer.parseInt(selectedPlayer));
	}

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	private List<Player> getPlayers() {
		if (playerList == null || dirty == true) {
			playerList = this.playerService.findAll();
			dirty = false;
			selectedPlayer = null;
		}
		return playerList;
	}

	/**
	 * Filtro player.
	 */
	public void filterPlayer() {
		playerList = this.playerService.findBySimilarName(playerFilter);
	}

	/**
	 * Guarda player.
	 *
	 * @return the string
	 */
	public String saveOrUpdatePlayer() {
		this.playerService.add(player);
		dirty = true;
		return "listadoPlayers";
	}

	/**
	 * eliminar player en respuesta a una llamada desde web
	 * 
	 *
	 * @param e the e
	 */
	public void removePlayer(ActionEvent e) {
		this.playerService.remove(Integer.valueOf(selectedPlayer));
		selectedPlayer = null;
		dirty = true;
	}

	/**
	 * Complete player.
	 *
	 * @param queryName the query name
	 * @return the list
	 */
	public List<String> completePlayer(String queryName) {
		playerFilter = queryName;
		List<String> results = new ArrayList<String>();
		List<Player> players = this.playerService.findBySimilarName(queryName);
		for (Player e : players) {
			results.add(e.getClass().getName());
		}
		return results;
	}

}
