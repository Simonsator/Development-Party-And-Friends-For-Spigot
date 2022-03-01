package de.simonsator.partyandfriendsgui.api.datarequest.party;

import org.bukkit.entity.Player;

public interface PartyDataCallBackRunnable {
	/**
	 * This method will be executed when the spigot server receives the party data from the bungeecord
	 *
	 * @param pPlayer The player for whom the information was asked
	 * @param pParty  The data of the party
	 * @param pId     An id which was created when the callback was registered to identify the request
	 */
	void onCallback(Player pPlayer, PartyData pParty, int pId);

	default void onTimeout(int pId) {

	}
}
