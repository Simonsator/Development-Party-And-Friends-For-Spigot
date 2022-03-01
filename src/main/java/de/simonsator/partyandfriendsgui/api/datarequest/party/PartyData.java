package de.simonsator.partyandfriendsgui.api.datarequest.party;

import de.simonsator.partyandfriendsgui.api.datarequest.DataRequestPlayerInfo;

import java.util.List;

public class PartyData {
	public final boolean DOES_EXIST;
	private final List<DataRequestPlayerInfo> PARTY_MEMBERS;
	private final DataRequestPlayerInfo PARTY_LEADER;
	private final PartyDataProperties PROPERTIES;

	PartyData(List<DataRequestPlayerInfo> partyMembers, DataRequestPlayerInfo partyLeader, PartyDataProperties partyDataProperties) {
		PARTY_MEMBERS = partyMembers;
		PARTY_LEADER = partyLeader;
		PROPERTIES = partyDataProperties;
		DOES_EXIST = true;
	}

	PartyData() {
		DOES_EXIST = false;
		PARTY_LEADER = null;
		PARTY_MEMBERS = null;
		PROPERTIES = null;
	}

	/**
	 * Returns the "normal" players who are in the party.
	 *
	 * @return Returns the "normal" players who are in the party.
	 */
	public List<DataRequestPlayerInfo> getPartyMembers() {
		return PARTY_MEMBERS;
	}

	/**
	 * @return Returns all players in this party (including the leader).
	 */
	public List<DataRequestPlayerInfo> getAllPlayers() {
		List<DataRequestPlayerInfo> allPlayers = getPartyMembers();
		DataRequestPlayerInfo leader = getPartyLeader();
		if (leader != null)
			allPlayers.add(leader);
		return allPlayers;
	}

	/**
	 * Gets the leader of this party
	 *
	 * @return Returns the party leader
	 */
	public DataRequestPlayerInfo getPartyLeader() {
		return PARTY_LEADER;
	}

	/**
	 * @return Returns the properties of this party. For example it contains information about if the party is public
	 */
	public PartyDataProperties getProperties() {
		return PROPERTIES;
	}
}
