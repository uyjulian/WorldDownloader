package com.uyjulian.LiteModWDL;

import java.io.File;
import wdl.WDL;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.SPacketBlockAction;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.network.play.server.SPacketCustomPayload;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.network.play.server.SPacketMaps;
import net.minecraft.util.text.ITextComponent;
import com.mumfrey.liteloader.LiteMod;
import com.mumfrey.liteloader.RenderListener;
import com.mumfrey.liteloader.transformers.event.EventInfo;
import com.mumfrey.liteloader.transformers.event.ReturnEventInfo;

public class LiteModWDL implements LiteMod, RenderListener {

	@Override
	public String getName() {
		return "LiteModWDL";
	}

	@Override
	public String getVersion() {
		return "1.9.4";
	}

	@Override
	public void init(File configPath) {

	}

	@Override
	public void upgradeSettings(String version, File configPath, File oldConfigPath) {
		
	}
	
	public static void ingameMenuInit(EventInfo<GuiIngameMenu> eventinfo) {}
	
	public static void ingameMenuActionPerformed(EventInfo<GuiIngameMenu> eventinfo, GuiButton guibutton) {
		/* WDL >>> */
		wdl.WDLHooks.handleWDLButtonClick(eventinfo.getSource(), guibutton);
		/* <<< WDL */
		//more down here
	}
	
	public static void worldClientTick(EventInfo<WorldClient> eventinfo) {
		//more up here
		/* WDL >>> */
		wdl.WDLHooks.onWorldClientTick(eventinfo.getSource());
		/* <<< WDL */
	}
	
	public static void worldClientDoPreChunk(EventInfo<WorldClient> eventinfo, int p_73025_1_, int p_73025_2_, boolean p_73025_3_) {
		/* WDL >>> */
        wdl.WDLHooks.onWorldClientDoPreChunk(eventinfo.getSource(), p_73025_1_, p_73025_2_, p_73025_3_);
		/* <<< WDL */
        //more down here
	}
	
	public static void worldClientRemoveEntityFromWorld(ReturnEventInfo<WorldClient, Entity> eventinfo, int p_73028_1_) { //return entity
		/* WDL >>> */
		wdl.WDLHooks.onWorldClientRemoveEntityFromWorld(eventinfo.getSource(), p_73028_1_);
		/* <<< WDL */
        //more down here
	}
	//seems like this isn't used in caa017493d9b90f0e9dc48e0269f910ee25bade9
//	
//	public static void worldClientAddBlockEvent(EventInfo<WorldClient> eventinfo, BlockPos pos, Block block, int eventId,
//			int eventParam) {
//		//more up here
//		if (wdl.WDL.downloading) {
//			wdl.WDLEvents.onBlockEvent(pos, block, eventId, eventParam);
//		}
//	}
	
	public static void netHandlerPlayClientHandleDisconnect(EventInfo<NetHandlerPlayClient> eventinfo, SPacketDisconnect p_147253_1_) {
		/* WDL >>> */
		if (wdl.WDL.downloading) {
			wdl.WDL.stopDownload();

			try {
				Thread.sleep(2000L);
			} catch (Exception var3) {
				;
			}
		}

		/* <<< WDL */
        //more down here
	}
	
	public static void netHandlerPlayClientOnDisconnect(EventInfo<NetHandlerPlayClient> eventinfo, ITextComponent p_147231_1_) {
		/* WDL >>> */
		if (wdl.WDL.downloading) {
			wdl.WDL.stopDownload();

			try {
				Thread.sleep(2000L);
			} catch (Exception var3) {
				;
			}
		}

		/* <<< WDL */
        //more down here
	}
	
	public static void netHandlerPlayClientHandleChat(EventInfo<NetHandlerPlayClient> eventinfo, SPacketChat p_147251_1_) {
		//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleChat(eventinfo.getSource(), p_147251_1_);
		/* <<< WDL */
	}
	
    public static void netHandlerPlayClientHandleBlockAction(EventInfo<NetHandlerPlayClient> eventinfo, SPacketBlockAction packetIn)
    {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleBlockAction(eventinfo.getSource(), packetIn);
		/* <<< WDL */
    }

    public static void netHandlerPlayClientHandleMaps(EventInfo<NetHandlerPlayClient> eventinfo, SPacketMaps packetIn)
    {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleMaps(eventinfo.getSource(), packetIn);
		/* <<< WDL */
    }
    
    public static void netHandlerPlayClientHandleCustomPayload(EventInfo<NetHandlerPlayClient> eventinfo, SPacketCustomPayload packetIn)
    {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleCustomPayload(eventinfo.getSource(), packetIn);
		/* <<< WDL */
    }
    
	@Override
	public void onRender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRenderGui(GuiScreen currentScreen) {
		if ((currentScreen instanceof GuiIngameMenu) && !(currentScreen instanceof GuiScreenInject)) {
			WDL.minecraft.displayGuiScreen(new GuiScreenInject());
		}
		
	}

	@Override
	public void onSetupCameraTransform() {
		// TODO Auto-generated method stub
		
	}

}
