package de.simonsator.partyandfriendsgui.communication;

import de.simonsator.partyandfriendsgui.communication.tasks.CommunicationTask;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

import java.util.ArrayList;

public class BungeecordCommunication implements PluginMessageListener {
	public static final String CHANNEL = "paf:gui";
	public static final int PROTOCOL_VERSION = 5;
	private static BungeecordCommunication instance;
	private final ArrayList<CommunicationTask> tasks = new ArrayList<>();

	public BungeecordCommunication() {
		instance = this;
	}

	public static BungeecordCommunication getInstance() {
		return instance;
	}

	/**
	 * Receive message from the BungeeCord
	 *
	 * @param channel The channel
	 * @param player  The player
	 * @param bytes   The byte code
	 */
	@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] bytes) {
	}

	public void registerTask(CommunicationTask pTask) {
		tasks.add(pTask);
	}

	public CommunicationTask getTask(Class<? extends CommunicationTask> pClass) {
		for (CommunicationTask task : tasks)
			if (task.getClass().equals(pClass))
				return task;
		return null;
	}

}
