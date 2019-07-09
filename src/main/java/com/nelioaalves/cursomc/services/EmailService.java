package com.nelioaalves.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.nelioaalves.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
