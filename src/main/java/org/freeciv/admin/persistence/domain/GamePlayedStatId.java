package org.freeciv.admin.persistence.domain;

import java.util.Date;

import javax.persistence.Embeddable;

/**
 * GamesPlayedStatsId generated by hbm2java.
 */
@Embeddable
public class GamePlayedStatId implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The stats date. */
	private Date statsDate;

	/** The game type. */
	private int gameType;

	/**
	 * Instantiates a new games played stats id.
	 */
	public GamePlayedStatId() {
		/* nothing to do. */
	}

	/**
	 * Instantiates a new games played stats id.
	 *
	 * @param statsDate the stats date
	 * @param gameType  the game type
	 */
	public GamePlayedStatId(Date statsDate, int gameType) {
		this.statsDate = statsDate;
		this.gameType = gameType;
	}

	/**
	 * Gets the stats date.
	 *
	 * @return the stats date
	 */
	public Date getStatsDate() {
		return this.statsDate;
	}

	/**
	 * Sets the stats date.
	 *
	 * @param statsDate the new stats date
	 */
	public void setStatsDate(Date statsDate) {
		this.statsDate = statsDate;
	}

	/**
	 * Gets the game type.
	 *
	 * @return the game type
	 */
	public int getGameType() {
		return this.gameType;
	}

	/**
	 * Sets the game type.
	 *
	 * @param gameType the new game type
	 */
	public void setGameType(int gameType) {
		this.gameType = gameType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GamePlayedStatId))
			return false;
		GamePlayedStatId castOther = (GamePlayedStatId) other;

		return ((this.getStatsDate() == castOther.getStatsDate()) || (this.getStatsDate() != null
				&& castOther.getStatsDate() != null && this.getStatsDate().equals(castOther.getStatsDate())))
				&& (this.getGameType() == castOther.getGameType());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getStatsDate() == null ? 0 : this.getStatsDate().hashCode());
		result = 37 * result + this.getGameType();
		return result;
	}

}