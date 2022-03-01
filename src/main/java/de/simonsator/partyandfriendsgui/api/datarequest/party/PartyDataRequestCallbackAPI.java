package de.simonsator.partyandfriendsgui.api.datarequest.party;

import de.simonsator.partyandfriendsgui.communication.tasks.CommunicationTask;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class PartyDataRequestCallbackAPI extends CommunicationTask {
	private static PartyDataRequestCallbackAPI instance;
	private final Map<Integer, PartyDataCallBackRunnable> partyRunnableAssignment = new HashMap<>();

	public PartyDataRequestCallbackAPI() {
		super("FetchPartyData");
		instance = this;
	}

	/**
	 * @return Returns an instance of this class
	 */
	public static PartyDataRequestCallbackAPI getInstance() {
		return instance;
	}

	/**
	 * @param pPlayer   The player for whom the party data should be received
	 * @param pRunnable This runnable will be executed when the spigot server receives the party data from the
	 *                     bungeecord
	 * @return An id which can be used to identify the request later on
	 */
	public abstract int fetchPartyData(Player pPlayer, PartyDataCallBackRunnable pRunnable);
}
