package com.uyjulian.LiteModWDL.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S24PacketBlockAction;
import net.minecraft.network.play.server.S34PacketMaps;
import net.minecraft.network.play.server.S3FPacketCustomPayload;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.util.IChatComponent;

@Mixin(NetHandlerPlayClient.class)
public abstract class MixinNetHandlerPlayClient implements INetHandlerPlayClient {
	@Inject(method="handleDisconnect", at=@At("HEAD"))
	private void onHandleDisconnect(S40PacketDisconnect p_147253_1_, CallbackInfo ci) {
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
	@Inject(method="onDisconnect", at=@At("HEAD"))
	private void onOnDisconnect(IChatComponent p_147231_1_, CallbackInfo ci) {
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
	@Inject(method="handleChat", at=@At("RETURN"))
	private void onHandleChat(S02PacketChat p_147251_1_, CallbackInfo ci) {
		//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleChat((NetHandlerPlayClient)(Object)this, p_147251_1_);
		/* <<< WDL */
	}
	@Inject(method="handleBlockAction", at=@At("RETURN"))
	private void onHandleBlockAction(S24PacketBlockAction packetIn, CallbackInfo ci) {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleBlockAction((NetHandlerPlayClient)(Object)this, packetIn);
		/* <<< WDL */
	}
	@Inject(method="handleMaps", at=@At("RETURN"))
	private void onHandleMaps(S34PacketMaps packetIn, CallbackInfo ci) {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleMaps((NetHandlerPlayClient)(Object)this, packetIn);
		/* <<< WDL */
	}
	@Inject(method="handleCustomPayload", at=@At("RETURN"))
	private void onHandleCustomPayload(S3FPacketCustomPayload packetIn, CallbackInfo ci) {
    	//more up here
		/* WDL >>> */
		wdl.WDLHooks.onNHPCHandleCustomPayload((NetHandlerPlayClient)(Object)this, packetIn);
		/* <<< WDL */
	}
}
