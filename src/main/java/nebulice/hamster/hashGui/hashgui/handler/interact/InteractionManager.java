package nebulice.hamster.hashGui.hashgui.handler.interact;

import nebulice.hamster.hashGui.hashgui.manager.HashGuiAbstractManager;
import nebulice.hamster.hashGui.hashitem.HashItem;

public class InteractionManager
	extends HashGuiAbstractManager<InteractHandler>
{

	@Override
	public HashGuiAbstractManager<InteractHandler> addItemHandlers(HashItem item)
	{
		return super.addItemHandlers(item, item.getInteractHandlers());
	}

}
