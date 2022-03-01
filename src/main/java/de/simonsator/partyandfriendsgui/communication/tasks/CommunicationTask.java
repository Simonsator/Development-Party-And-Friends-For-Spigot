package de.simonsator.partyandfriendsgui.communication.tasks;

import com.google.gson.JsonObject;
import org.bukkit.entity.Player;

/**
 * @author Simonsator
 * @version 1.0.0 on 06.07.2016
 */
public abstract class CommunicationTask {
	private final String name;

	protected CommunicationTask(String pName) {
		name = pName;
	}

	public abstract void executeTask(Player pPlayer, JsonObject pJObj);

	public boolean isApplicable(String pName) {
		return pName.equals(name);
	}

}
