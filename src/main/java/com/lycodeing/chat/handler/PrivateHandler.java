package com.lycodeing.chat.handler;

import com.lycodeing.chat.base.Message;
import com.lycodeing.chat.core.ConnectionManager;
import com.lycodeing.chat.service.OfflineMessageService;
import com.lycodeing.chat.utils.GsonUtil;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public class PrivateHandler implements MessageHandler{

    private final OfflineMessageService offlineMessageService;

    public PrivateHandler(OfflineMessageService offlineMessageService) {
        this.offlineMessageService = offlineMessageService;
    }

    @Override
    public void handleMessage(Message message) {
        Channel channel = ConnectionManager.getChannelById(message.getTo());
        if(channel != null){
            channel.writeAndFlush(new TextWebSocketFrame(GsonUtil.toJson(message)));
        }else {
            offlineMessageService.saveOfflineMessage(message.getTo(), message);
        }

    }

    @Override
    public void sendMessage(String recipientId, Message message) {

    }
}
