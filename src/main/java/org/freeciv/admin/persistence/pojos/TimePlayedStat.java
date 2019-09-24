package org.freeciv.admin.persistence.pojos;

import java.util.Date;

/**
 * TimePlayedStats generated by hbm2java.
 */
public class TimePlayedStat implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The stats date. */
	private Date statsDate;

	/** The time played. */
	private Integer timePlayed;

	/**
	 * Instantiates a new time played stats.
	 */
	public TimePlayedStat() {
		/* nothing to do. */
	}

	/**
	 * Instantiates a new time played stats.
	 *
	 * @param statsDate the stats date
	 */
	public TimePlayedStat(Date statsDate) {
		this.statsDate = statsDate;
	}

	/**
	 * Instantiates a new time played stats.
	 *
	 * @param statsDate  the stats date
	 * @param timePlayed the time played
	 */
	public TimePlayedStat(Date statsDate, Integer timePlayed) {
		this.statsDate = statsDate;
		this.timePlayed = timePlayed;
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
	 * Gets the time played.
	 *
	 * @return the time played
	 */
	public Integer getTimePlayed() {
		return this.timePlayed;
	}

	/**
	 * Sets the time played.
	 *
	 * @param timePlayed the new time played
	 */
	public void setTimePlayed(Integer timePlayed) {
		this.timePlayed = timePlayed;
	}

}