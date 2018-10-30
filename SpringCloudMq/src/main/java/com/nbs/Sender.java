package com.nbs;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	//@Value("${mq.config.queue.info.routing.key}")
	//private String routingkey;
	
	public void send(String msg){
		//this.amqpTemplate.convertAndSend("hello-queue", msg);
		//this.amqpTemplate.convertAndSend(this.exchange, "user.log.debug", "user.log.debug..."+msg);
		//this.amqpTemplate.convertAndSend(this.exchange, "user.log.info", "user.log.info..."+msg);
		//this.amqpTemplate.convertAndSend(this.exchange, "user.log.warn", "user.log.warn..."+msg);
		this.amqpTemplate.convertAndSend(this.exchange, "", "sms..."+msg);		
	}

}
