package de.simonsator.partyandfriendsgui.api;

import com.google.gson.JsonObject;
import de.simonsator.datastructures.ItemPackage;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;

public class PartyFriendsAPI {
	private static final ArrayList<ItemPackage> CUSTOM_SETTINGS = new ArrayList<>();

	/**
	 * Adds a setting to the Party and Friends GUI settings interface
	 *
	 * @param pSetting The setting
	 * @see de.simonsator.datastructures.ItemPackage
	 */
	public static void addCustomSetting(ItemPackage pSetting) {
		CUSTOM_SETTINGS.add(pSetting);
		Collections.sort(CUSTOM_SETTINGS);
	}

	/**
	 * @return Returns the settings which will be added into the settings
	 * interface of the Party and Friends GUI settings
	 */
	public static ArrayList<ItemPackage> getCustomSettings() {
		return CUSTOM_SETTINGS;
	}

	/**
	 * Opens the main inventory
	 *
	 * @param pPlayer For whom the main inventory should be open
	 * @param pPage   The page that should be opened
	 */
	public static void openMainInventory(Player pPlayer, int pPage) {
	}

	public static void openMainInventory(Player pPlayer, int pPage, int pNewSortMode) {
	}

	/**
	 * Opens the party inventory
	 *
	 * @param pPlayer For whom the party inventory should be open
	 * @param pPage   The page that should be opened
	 */
	public static void openPartyInventory(Player pPlayer, int pPage) {
	}

	/**
	 * Opens the hide inventory
	 *
	 * @param pPlayer For whom the hide inventory should be open
	 */
	public static void openHideInventory(Player pPlayer) {
	}

	/**
	 * Opens the friend request inventory
	 *
	 * @param pPlayer For whom the friend request inventory should be open
	 */
	public static void openFriendRequestsMenu(Player pPlayer) {
	}

	/**
	 * Opens the settings inventory
	 *
	 * @param pPlayer For whom the settings inventory should be open
	 */
	public static void openSettingsInventory(Player pPlayer) {
	}

	/**
	 * Sets the hide mode of a player.
	 *
	 * @param pPlayer The player for whom the hide mode should be set.
	 * @param worth   Possible worth:
	 *                <ul>
	 *                <li>0 Shows all Players</li>
	 *                <li>1 Show only Friends and people of the server team</li>
	 *                <li>2 Show only friends</li>
	 *                <li>3 Show only people of the server team</li>
	 *                <li>4 Hide all players</li>
	 *                <li>5 Show only party members</li>
	 *                </ul>
	 */
	public static void setHideMode(Player pPlayer, int worth) {
	}

	/**
	 * Reloads the hide mode for a specific player
	 *
	 * @param pPlayer The player for whom the hide mode should be reloaded
	 * @param pJoin   If they just joined
	 */
	public static void loadHideMode(Player pPlayer, boolean pJoin) {
	}

	/**
	 * Sends a player a friend request
	 *
	 * @param pRequester The sender of the friend request
	 * @param pRequested The receiver
	 */
	@Deprecated
	public static void sendFriendRequest(Player pRequester, String pRequested) {
	}

	public static void sendOrAcceptFriendRequest(Player pRequester, String pRequested) {
	}

	/**
	 * Accepts a friend request (runs through the /friend accept command)
	 *
	 * @param pPlayer The player who accepts the friend request
	 * @param pFriend The friend request who should be accept
	 */
	public static void acceptFriendRequest(Player pPlayer, String pFriend) {
	}

	/**
	 * Declines a friend request (runs through the /friend deny command)
	 *
	 * @param pPlayer The player who is denying the friend request
	 * @param toDeny  The rejected friend request
	 */
	public static void declineFriendRequest(Player pPlayer, String toDeny) {
	}

	/**
	 * Removes a friend
	 *
	 * @param pPlayer The player who removes the friend
	 * @param pFriend The friend who should be removed
	 */
	public static void deleteFriend(Player pPlayer, String pFriend) {
	}

	/**
	 * The player who should jump to a friend (runs through the /friend jump
	 * command)
	 *
	 * @param pPlayer The player who jumps to the friend
	 * @param pFriend The friend who should be jump to
	 */
	public static void jumpTo(Player pPlayer, String pFriend) {
	}

	public static void kickPlayer(Player pSender, String pToKick) {
	}

	public static void makeLeader(Player pSender, String pNewLeader) {
	}

	public static void leaveParty(Player pPlayer) {
	}

	/**
	 * Invites a player into a party
	 *
	 * @param pInviter The inviter
	 * @param pInvited The player who should be invited into the party
	 */
	public static void inviteIntoParty(Player pInviter, String pInvited) {
	}

	public static void changeSetting(Player pPlayer, String pSettingName) {
	}

	/**
	 * Changes the friend request setting
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeSettingFriendRequests(Player pPlayer) {
	}

	/**
	 * Changes the setting who can invite the player into a party
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeSettingParty(Player pPlayer) {
	}

	/**
	 * Changes the show always as offline setting
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeSettingOffline(Player pPlayer) {
	}

	/**
	 * Changes the jump setting
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeSettingJump(Player pPlayer) {
	}

	/**
	 * Changes the receive messages setting
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeMessageSetting(Player pPlayer) {
	}

	/**
	 * Changes the receive friend went offline/online notification setting
	 *
	 * @param pPlayer The player for whom the setting should be changed
	 */
	public static void changeStatusNotifySetting(Player pPlayer) {
	}

	/**
	 * Executes a BungeeCord command
	 *
	 * @param pCommand The command (inclusive the arguments) which should be executed
	 * @param pPlayer  The player who will be executing the command
	 */
	public static void executeBungeeCordCommand(String pCommand, Player pPlayer) {
	}

	public static void sendMessage(JsonObject pJObj, Player pPlayer) {
	}
}
