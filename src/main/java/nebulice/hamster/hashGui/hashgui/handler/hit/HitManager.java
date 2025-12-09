package nebulice.hamster.hashGui.hashgui.handler.hit;

import nebulice.hamster.hashGui.hashgui.manager.HashGuiAbstractManager;
import nebulice.hamster.hashGui.hashitem.HashItem;

public class HitManager
	extends HashGuiAbstractManager<HitHandler>
{

	@Override
	public HashGuiAbstractManager<HitHandler> addItemHandlers(HashItem item)
	{
		return super.addItemHandlers(item, item.getHitHandlers());
	}

}
