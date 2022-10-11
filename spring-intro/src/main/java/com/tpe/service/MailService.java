package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;

@Component
@Qualifier("mailService")//
public class MailService implements MessageService {
	
	//Field injection
	
	@Autowired//otomatik olarak baðla
	@Qualifier("fileRepository")
	private Repository repository; 
	
	@Value("${app.email}")
	private String email;
	

	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a mail service, I am sending a message to "+email+":"+message.getMessage());
		repository.saveMessage(message);
	}
	
	
	

}
