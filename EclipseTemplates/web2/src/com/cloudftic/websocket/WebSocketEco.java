package com.cloudftic.websocket;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/*
 * Este web socket simplemente actua de eco
 */
@ServerEndpoint("/eco")
public class WebSocketEco {
	@OnOpen
	public void open(Session session) {
		System.out.println("..............Recibida conexion.....");
	}

	@OnMessage
	public String onMessage(String message) {
		return "Eco: " +  message;
	}

}
