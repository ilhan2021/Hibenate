package com.tpe.service;

import com.tpe.domain.Message;
import com.tpe.repository.Repository;



public class MailService implements MessageService {

	Repository repository;
	
	public MailService( Repository repository) {
		//MailService Repositorya ihtiyac� var
	 this.repository=repository;
	 
	    //maintance zor, hardcoded
		//repository=new DBRepository();
	}
	
	@Override
	public void sendMessage(Message message) {
		System.out.println("I am a mail service, I am sending a message:"+message.getMessage());

		//G�nderilen mesaj� ayn� zamanda kaydetmek istiyorum. O nedenle bir saveMessage �a��rmaya
		//ihtyiac�m var.saveMessage'i kimin �zerinden kullnan�yorum: Repository;
		repository.saveMessage(message);
		
	}
	
	
	

}
