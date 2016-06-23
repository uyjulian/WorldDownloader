package com.uyjulian.LiteModWDL;

import net.minecraft.client.gui.GuiIngameMenu;

public class GuiScreenInject extends GuiIngameMenu {
	@Override
	public void initGui() {
		super.initGui();
		// Your own code //
		/* WDL >>> */
		wdl.WDLHooks.injectWDLButtons(this, buttonList);
		/* <<< WDL */
	}
	
}
