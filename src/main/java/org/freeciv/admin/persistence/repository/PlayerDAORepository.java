package org.freeciv.admin.persistence.repository;

import org.freeciv.admin.persistence.domain.Player;
import org.freeciv.admin.persistence.domain.PlayerId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerDAORepository.
 */
@Repository
public interface PlayerDAORepository extends CrudRepository<Player, PlayerId> {

	/**
	 * Find by player id.
	 *
	 * @param playerId the player id
	 * @return the player
	 */
	Player findByPlayerId(PlayerId playerId);

}
