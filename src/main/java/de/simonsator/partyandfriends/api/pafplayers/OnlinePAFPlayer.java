package de.simonsator.partyandfriends.api.pafplayers;

import de.simonsator.partyandfriends.api.party.PartyManager;
import de.simonsator.partyandfriends.api.party.PlayerParty;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface OnlinePAFPlayer extends PAFPlayer {
	void createEntry();

	void connect(Location pInfo);

	boolean teleportTo(OnlinePAFPlayer pPlayer);

	Location getLocation();

	String getServerDisplayName();

	boolean isOnline();

	int changeSettingsWorth(int pSettingsID);

	void sendPacket(TextComponent pTextComponent);

	void update();

	Player getPlayer();

	default PlayerParty getParty() {
		return PartyManager.getInstance().getParty(this);
	}
}
