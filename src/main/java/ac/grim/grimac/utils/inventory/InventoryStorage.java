package ac.grim.grimac.utils.inventory;

import com.github.retrooper.packetevents.protocol.item.ItemStack;

public class InventoryStorage {
    ItemStack[] items;

    public InventoryStorage(int size) {
        this.items = new ItemStack[size];

        for (int i = 0; i < size; i++) {
            items[i] = ItemStack.EMPTY;
        }
    }

    public void setItem(int item, ItemStack stack) {
        items[item] = stack;
    }

    public ItemStack getItem(int index) {
        return items[index];
    }

    public ItemStack removeItem(int slot, int amount) {
        return slot >= 0 && slot < items.length && !items[slot].isEmpty() && amount > 0 ? items[slot].split(amount) : ItemStack.EMPTY;
    }

    public int getMaxStackSize() {
        return 64;
    }
}