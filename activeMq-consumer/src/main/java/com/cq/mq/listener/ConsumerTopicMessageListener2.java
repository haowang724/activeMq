package com.cq.mq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerTopicMessageListener2 implements MessageListener{

	@Override
	public void onMessage(Message message) {
		TextMessage textMsg = (TextMessage) message;
        try {
            System.out.println("Topic接收者2收到消息：" + textMsg.getText());
            System.out.println("开始进行解析并调用service执行....");
            
        } catch (JMSException e) {
            e.printStackTrace();
        }				
	}

}
