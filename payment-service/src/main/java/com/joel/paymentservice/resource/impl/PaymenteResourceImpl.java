package com.joel.paymentservice.resource.impl;

import com.joel.paymentservice.model.Payment;
import com.joel.paymentservice.resource.PaymentResource;
import com.joel.paymentservice.service.PaymenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
public class PaymenteResourceImpl implements PaymentResource {

    private final PaymenteService paymenteService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymenteService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
