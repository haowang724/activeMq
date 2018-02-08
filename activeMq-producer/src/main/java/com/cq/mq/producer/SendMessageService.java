package com.cq.mq.producer;

public interface SendMessageService {
	
     public void send(String message);

	 public void sendTopic(String string);
}
