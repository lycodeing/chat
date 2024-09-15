package com.lycodeing.chat.config;

import com.lycodeing.chat.base.Message;
import com.lycodeing.chat.handler.MessageHandler;
import com.lycodeing.chat.handler.PrivateHandler;
import com.lycodeing.chat.processor.MessageProcessor;
import com.lycodeing.chat.service.AuthenticationService;
import com.lycodeing.chat.service.OfflineMessageService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Configurable
public class ChatConfig {

    private final OfflineMessageService offlineMessageService;

    public ChatConfig(OfflineMessageService offlineMessageService) {
        this.offlineMessageService = offlineMessageService;
    }

    @Bean
    public MessageHandlerRegistry registry() {
        return MessageHandlerRegistry.INSTANCE
                .register("private", new PrivateHandler(offlineMessageService));
    }

    @Bean
    public MessageProcessor processor(){
        return new MessageProcessor() {
            @Override
            public void processMessage(Message message) {
                MessageHandler handler = registry().getMessageHandler(message.getTarget());
                if(handler!=null){
                    handler.handleMessage(message);
                }
            }
        };
    }


    @Bean
    public AuthenticationService authenticationService(){
        return new AuthenticationService() {
            @Override
            public boolean authenticate(String token) {
                return true;
            }

            @Override
            public String getUserIdFromToken(String token) {
                return token;
            }
        };
    }
}
