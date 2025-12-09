package nebulice.hamster.hashGui.hashgui.handler.destroy;

import nebulice.hamster.hashGui.hashgui.manager.HashGuiAbstractManager;
import nebulice.hamster.hashGui.hashitem.HashItem;

public class DestroyManager
	extends HashGuiAbstractManager<DestroyHandler>
{

	@Override
	public HashGuiAbstractManager<DestroyHandler> addItemHandlers(HashItem item)
	{
		return super.addItemHandlers(item, item.getDestroyHandlers());
	}

}