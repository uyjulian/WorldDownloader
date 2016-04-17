package com.uyjulian.LiteModWDL;

import wdl.WDL;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;

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
