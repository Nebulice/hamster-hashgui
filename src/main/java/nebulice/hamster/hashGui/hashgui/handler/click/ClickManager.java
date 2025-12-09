package nebulice.hamster.hashGui.hashgui.handler.click;

import nebulice.hamster.hashGui.hashgui.manager.HashGuiAbstractManager;
import nebulice.hamster.hashGui.hashitem.HashItem;

public class ClickManager
	extends HashGuiAbstractManager<ClickHandler>
{

	@Override
	public HashGuiAbstractManager<ClickHandler> addItemHandlers(HashItem item)
	{
		return super.addItemHandlers(item, item.getClickHandlers());
	}

}
