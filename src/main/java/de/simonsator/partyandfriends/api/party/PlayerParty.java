package de.simonsator.partyandfriends.api.party;

import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.api.pafplayers.PAFPlayer;
import net.md_5.bungee.api.chat.TextComponent;

import java.util.List;
import java.util.UUID;

public abstract class PlayerParty {
	/**
	 * Returns true if the given player is the leader of this party, and it will
	 * returns false if he is not the leader, of this party
	 *
	 * @param player The player
	 * @return Returns a true if the given player is the leader of this party,
	 * and it will returns false if he is not the leader, of this party
	 */
	public abstract boolean isLeader(PAFPlayer player);

	public boolean isLeader(OnlinePAFPlayer player) {
		return isLeader((PAFPlayer) player);
	}

	public abstract boolean isBanned(PAFPlayer pPlayer);

	public abstract void setBanned(PAFPlayer pPlayer, boolean pIsBanned);

	public abstract boolean isPrivate();

	public abstract void setPrivateState(boolean pIsPrivate);

	/**
	 * Returns true if the player is in the party. Returns false if the player
	 * is not in the party.
	 *
	 * @param pPlayer The player
	 * @return Returns true if the player is in the party. Returns false if the
	 * player is not in the party.
	 */
	public boolean isInParty(OnlinePAFPlayer pPlayer) {
		return isAMember(pPlayer) || pPlayer.getUniqueId().equals(getLeader().getUniqueId());
	}

	protected abstract boolean isAMember(OnlinePAFPlayer pPlayer);

	protected abstract List<UUID> getInvited();

	public boolean isNobodyInvited() {
		return getInvited().isEmpty();
	}

	/**
	 * Gets the leader of this party
	 *
	 * @return Returns the party leader
	 */
	public abstract OnlinePAFPlayer getLeader();

	/**
	 * Sets the party leader.
	 *
	 * @param player The player
	 */
	public abstract void setLeader(OnlinePAFPlayer player);

	/**
	 * @return Returns all players in this party (inclusive the leader).
	 */
	public List<OnlinePAFPlayer> getAllPlayers() {
		List<OnlinePAFPlayer> allPlayers = getPlayers();
		PAFPlayer leader = getLeader();
		if (leader != null)
			allPlayers.add((OnlinePAFPlayer) leader);
		return allPlayers;
	}

	protected abstract void removePlayerSilent(PAFPlayer pPlayer);

	/**
	 * Returns the "normal" players who are in the party.
	 *
	 * @return Returns the "normal" players who are in the party.
	 */
	public abstract List<OnlinePAFPlayer> getPlayers();

	/**
	 * Adds a player to the party
	 *
	 * @param pPlayer The player
	 * @return Returns true if the player was added to this party. Returns false
	 * if the player was not added to this party
	 */
	public abstract boolean addPlayer(OnlinePAFPlayer pPlayer);

	public void leaveParty(OnlinePAFPlayer pPlayer) {
		leaveParty((PAFPlayer) pPlayer);
	}

	public abstract void leaveParty(PAFPlayer pPlayer);

	public abstract void kickPlayer(OnlinePAFPlayer pPlayer);

	/**
	 * Invites a player into this party
	 *
	 * @param pPlayer The player
	 */
	public abstract void invite(final OnlinePAFPlayer pPlayer);

	public abstract void removeFromInvited(PAFPlayer pPlayer);

	public void removeFromInvited(OnlinePAFPlayer pPlayer) {
		removeFromInvited((PAFPlayer) pPlayer);
	}

	protected abstract void addToInvited(OnlinePAFPlayer pPlayer);

	public boolean isPartyEmpty() {
		return getPlayers().isEmpty() && isNobodyInvited();
	}

	/**
	 * Returns the size of the invitation list
	 *
	 * @return Returns the size of the invitation list
	 */
	public abstract int getInviteListSize();

	/**
	 * Returns true if the player is already invited or if the party is public. Returns false if the
	 * player is not invited.
	 *
	 * @param pPlayer The player
	 * @return Returns true if the player is already invited. Returns false if
	 * the player is not invited.
	 */
	public boolean isInvited(OnlinePAFPlayer pPlayer) {
		return !isPrivate() || getInvited().contains(pPlayer.getUniqueId());
	}

	public void sendMessage(TextComponent pText) {
		for (OnlinePAFPlayer player : getAllPlayers())
			player.sendMessage(pText);
	}

	public void sendMessage(String pText) {
		for (OnlinePAFPlayer player : getAllPlayers())
			player.sendMessage(pText);
	}

	protected abstract boolean needsNewLeader(PAFPlayer pPlayer);

	protected abstract void findNewLeader();

}
