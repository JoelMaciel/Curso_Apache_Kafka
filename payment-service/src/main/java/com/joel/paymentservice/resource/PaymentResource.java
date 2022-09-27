package com.joel.paymentservice.resource;

import com.joel.paymentservice.model.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentResource {

    ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
