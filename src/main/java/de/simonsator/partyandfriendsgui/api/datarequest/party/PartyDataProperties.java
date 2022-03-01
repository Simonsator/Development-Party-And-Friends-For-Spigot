package de.simonsator.partyandfriendsgui.api.datarequest.party;

public class PartyDataProperties {
	/**
	 * Can anybody join the party without an invitation?
	 */
	public final boolean IS_PUBLIC;

	public PartyDataProperties(boolean isPublic) {
		IS_PUBLIC = isPublic;
	}
}
