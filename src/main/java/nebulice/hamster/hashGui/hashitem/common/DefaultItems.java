package nebulice.hamster.hashGui.hashitem.common;

import nebulice.hamster.hashGui.hashitem.HashItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;

/**
 * This enum stores the default items.
 */
public enum DefaultItems
{

    ITEM_NOT_FOUND(
        new HashItem(Material.BARRIER)
            .setName(Component.text("Item not found.").color(NamedTextColor.RED))
            .addLore(Component.text("I am a poor dev that can't do his work properly.").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC))
    ),

    ITEM_BUILD_FAIL(
        new HashItem(Material.BARRIER)
            .setName(Component.text("Item failed to build.").color(NamedTextColor.RED))
            .addLore(Component.text("I am a poor dev that can't do his work properly.").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC))
    );


    private final HashItem item;


    /**
     * Creates a new Default Item.
     *
     * @param   item    Item
     */
    DefaultItems(HashItem item)
    {
        this.item = item
            .setUntakable(true);
    }


    /**
     * @return  Item
     */
    public HashItem getItem()
    {
        return this.item;
    }

}
