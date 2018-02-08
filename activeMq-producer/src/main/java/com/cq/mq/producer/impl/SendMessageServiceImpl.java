package com.cq.mq.producer.impl;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.cq.mq.producer.SendMessageService;
@Service
public class SendMessageServiceImpl implements SendMessageService{
    
	@Resource
	private JmsTemplate jmsTemplate;
	
	@Resource
	private JmsTemplate topicJmsTemplate;
	
	@Override
	public void send(String message) {
		jmsTemplate.send(new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}		
		});
	}

	@Override
	public void sendTopic(String message) {
		topicJmsTemplate.send(new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}		
		});
	}

}
