package com.hulkhiretech.payments.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hulkhiretech.payments.dto.stripe.CheckoutSessionCompletedData;
import com.hulkhiretech.payments.dto.stripe.StripeEventDTO;
import com.hulkhiretech.payments.service.interfaces.StripeWebhookService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class StripeWebhookServiceImpl implements StripeWebhookService {

	private static final String CHECKOUT_SESSION_ASYNC_PAYMENT_FAILED = "checkout.session.async_payment_failed";
	private static final String CHECKOUT_SESSION_COMPLETED = "checkout.session.completed";
	private static final String CHECKOUT_SESSION_ASYNC_PAYMENT_SUCCEEDED = "checkout.session.async_payment_succeeded";

	private final Gson gson;
	@Override
	public void processEvent(StripeEventDTO eventDTO) {
		if(CHECKOUT_SESSION_COMPLETED.equals(eventDTO.getType())) {
			
			CheckoutSessionCompletedData objData = gson.fromJson(eventDTO.getData().getObject(),
					CheckoutSessionCompletedData.class);
			log.info("Checkout session completed event received|| objData{}", objData);
			//CheckoutSessionCompletedData
			
			return ;
	}
	
		if(CHECKOUT_SESSION_ASYNC_PAYMENT_SUCCEEDED.equals(eventDTO.getType())) {
			
			log.info("Checkout session completed event received");
			return ;
		}
		
		if (CHECKOUT_SESSION_ASYNC_PAYMENT_FAILED.equals(eventDTO.getType())) {

			log.info("Checkout session completed event received");
			return;
		}
		
		log.info("Event type not configured eventType:{}", eventDTO.getType());
	}
}
