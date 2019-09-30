package org.freeciv.admin.persistence.dao;

import org.freeciv.admin.persistence.pojos.Player;
import org.freeciv.admin.persistence.pojos.PlayerId;
import org.springframework.data.repository.CrudRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerDAORepository.
 */
public interface PlayerDAORepository extends CrudRepository<Player, PlayerId> {

	Player findByPlayerId(PlayerId playerId);

}
