package com.crud.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ProcessWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Simulação de envio de progresso de 0 a 100
        for (int i = 0; i <= 100; i += 10) {
            Thread.sleep(1000); // Simula tempo de processamento
            session.sendMessage(new TextMessage("{ \"progress\": " + i + " }"));
        }
    }
}
