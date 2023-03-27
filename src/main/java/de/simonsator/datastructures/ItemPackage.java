package de.simonsator.datastructures;

import org.bukkit.inventory.ItemStack;

public class ItemPackage implements Comparable<ItemPackage> {
	private final ItemStack TOP_ITEM;
	private final ItemStack LOWER_ITEM;
	private final Integer PRIORITY;

	/**
	 * Initials the ItemPackage
	 *
	 * @param pTopItem   This item should be placed over the lower item
	 * @param pLowerItem This item should be placed under the top item
	 */
	@Deprecated
	public ItemPackage(ItemStack pTopItem, ItemStack pLowerItem) {
		TOP_ITEM = pTopItem;
		LOWER_ITEM = pLowerItem;
		PRIORITY = 0;
	}

	/**
	 * Initials the ItemPackage
	 *
	 * @param pTopItem   This item should be placed over the lower item
	 * @param pLowerItem This item should be placed under the top item
	 * @param pPriority  The priority of this setting. A higher number will be listed first
	 */
	public ItemPackage(ItemStack pTopItem, ItemStack pLowerItem, int pPriority) {
		TOP_ITEM = pTopItem;
		LOWER_ITEM = pLowerItem;
		PRIORITY = pPriority;
	}

	/**
	 * @return Returns the item which should be over the lower item
	 */
	public ItemStack getTopItem() {
		return TOP_ITEM;
	}

	/**
	 * @return Returns the item which should be under the top item
	 */
	public ItemStack getLowerItem() {
		return LOWER_ITEM;
	}

	@Override
	public int compareTo(ItemPackage o) {
		return PRIORITY.compareTo(o.PRIORITY);
	}
}
