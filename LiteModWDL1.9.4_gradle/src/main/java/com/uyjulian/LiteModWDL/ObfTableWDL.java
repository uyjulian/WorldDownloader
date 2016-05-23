package com.uyjulian.LiteModWDL;

import com.mumfrey.liteloader.core.runtime.Obf;

public class ObfTableWDL extends Obf {
	public static ObfTableWDL NetHandlerPlayClient = new ObfTableWDL("net/minecraft/client/network/NetHandlerPlayClient","bkq");
	public static ObfTableWDL WorldClient = new ObfTableWDL("net/minecraft/client/multiplayer/WorldClient","bks");
	public static ObfTableWDL GuiIngameMenu = new ObfTableWDL("net/minecraft/client/gui/GuiIngameMenu","bev");
	
	public static ObfTableWDL GuiButton = new ObfTableWDL("net/minecraft/client/gui/GuiButton","bcx");
	public static ObfTableWDL Entity = new ObfTableWDL("net/minecraft/entity/Entity","rr");
	public static ObfTableWDL Block = new ObfTableWDL("net/minecraft/block/Block","ajt");
	public static ObfTableWDL S40PacketDisconnect = new ObfTableWDL("net/minecraft/network/play/server/SPacketDisconnect","gl");
	public static ObfTableWDL IChatComponent = new ObfTableWDL("net/minecraft/util/text/ITextComponent","ew");
	public static ObfTableWDL S02PacketChat = new ObfTableWDL("net/minecraft/network/play/server/SPacketChat","ga");
	public static ObfTableWDL BlockPos = new ObfTableWDL("net/minecraft/util/math/BlockPos","cl");
	public static ObfTableWDL S24PacketBlockAction = new ObfTableWDL("net/minecraft/network/play/server/SPacketBlockAction","fv");
	public static ObfTableWDL S34PacketMaps = new ObfTableWDL("net/minecraft/network/play/server/SPacketMaps","gv");
	public static ObfTableWDL S3FPacketCustomPayload = new ObfTableWDL("net/minecraft/network/play/server/SPacketCustomPayload","gj");
	
	public static ObfTableWDL GuiIngameMenu_initGui = new ObfTableWDL("func_73866_w_","b","initGui");
	public static ObfTableWDL GuiIngameMenu_actionPerformed = new ObfTableWDL("func_146284_a","a","actionPerformed");
	
	public static ObfTableWDL WorldClient_tick = new ObfTableWDL("func_72835_b","d","tick");
	public static ObfTableWDL WorldClient_doPreChunk = new ObfTableWDL("func_73025_a","b","doPreChunk");
	public static ObfTableWDL WorldClient_removeEntityFromWorld = new ObfTableWDL("func_73028_b","e","removeEntityFromWorld");
	//seems like this isn't used in caa017493d9b90f0e9dc48e0269f910ee25bade9
//	public static ObfTableWDL WorldClient_addBlockEvent = new ObfTableWDL("func_175641_c","c","addBlockEvent");
	
	public static ObfTableWDL NetHandlerPlayClient_handleDisconnect = new ObfTableWDL("func_147253_a","a","handleDisconnect");
	public static ObfTableWDL NetHandlerPlayClient_onDisconnect = new ObfTableWDL("func_147231_a","a","onDisconnect");
	public static ObfTableWDL NetHandlerPlayClient_handleChat = new ObfTableWDL("func_147251_a","a","handleChat");
	public static ObfTableWDL NetHandlerPlayClient_handleBlockAction = new ObfTableWDL("func_147261_a","a","handleBlockAction");
	public static ObfTableWDL NetHandlerPlayClient_handleMaps = new ObfTableWDL("func_147264_a","a","handleMaps");
	public static ObfTableWDL NetHandlerPlayClient_handleCustomPayload = new ObfTableWDL("func_147240_a","a","handleCustomPayload");

	protected ObfTableWDL(String seargeName, String obfName) {
		super(seargeName, obfName);
	}
	
	protected ObfTableWDL(String seargeName, String obfName, String mcpName) {
		super(seargeName, obfName, mcpName);
	}

}
