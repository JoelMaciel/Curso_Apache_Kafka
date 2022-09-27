package com.joel.paymentservice.service.impl;

import com.joel.paymentservice.model.Payment;
import com.joel.paymentservice.service.PaymenteService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymenteService {

    private final KafkaTemplate<String , Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
        log.info("Recebi pagamento {}", payment);
        Thread.sleep(1000);
        log.info("Enviando pagamento.... ");
        kafkaTemplate.send("payment-topic", payment);

    }
}
