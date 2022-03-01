package de.simonsator.partyandfriendsgui.api.datarequest;

import java.util.UUID;

public class DataRequestPlayerInfo {
	public final String PLAYER_NAME;
	public final UUID PLAYER_UUID;
	/**
	 * The display name of the server where the player is on
	 */
	public final String SERVER_NAME;

	public DataRequestPlayerInfo(String playerName, UUID playerUUID, String pServerName) {
		PLAYER_NAME = playerName;
		PLAYER_UUID = playerUUID;
		SERVER_NAME = pServerName;
	}
}
