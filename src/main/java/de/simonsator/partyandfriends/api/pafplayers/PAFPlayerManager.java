package de.simonsator.partyandfriends.api.pafplayers;

import org.bukkit.entity.Player;

import java.util.UUID;

public abstract class PAFPlayerManager {
	private static PAFPlayerManager instance;

	public PAFPlayerManager() {
		instance = this;
	}

	public static PAFPlayerManager getInstance() {
		return instance;
	}

	/**
	 * @param pPlayer The name of the player
	 * @return Returns either a {@link PAFPlayer} if the player is offline/does not exist
	 * (check with {@link PAFPlayer#doesExist()}) or an {@link OnlinePAFPlayer} if the player is online
	 */
	public abstract PAFPlayer getPlayer(String pPlayer);

	public abstract OnlinePAFPlayer getPlayer(Player pPlayer);

	/**
	 * @param pPlayer The UUID of the player
	 * @return Returns either a {@link PAFPlayer} if the player is offline/does not exist
	 * (check with {@link PAFPlayer#doesExist()}) or an {@link OnlinePAFPlayer} if the player is online
	 */
	public abstract PAFPlayer getPlayer(UUID pPlayer);
}
