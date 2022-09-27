package com.joel.paymentservice.service;

import com.joel.paymentservice.model.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymenteService{

    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENTE_SERVICE_IMPL ::: Recebi pagamento {}", payment);

    }
}
