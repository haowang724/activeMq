package com.cq.mq.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cq.mq.producer.SendMessageService;

@Controller
@RequestMapping("/sendMessage")
public class SendMessageAction {
    private Logger logger = Logger.getLogger(SendMessageAction.class);
    @Resource
    private SendMessageService sendMessageService;
    
    @ResponseBody
    @RequestMapping("/send")
    public String sendMqMessage(){
    	sendMessageService.send("activeMq 发送消息---"+System.currentTimeMillis());
    	logger.info("消息发送了==========");
    	return "jsm activemq complete";
    }
}
