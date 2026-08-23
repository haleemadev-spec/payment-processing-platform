package com.haleema.payment;

import org.springframework.boot.SpringApplication;

public class TestPaymentProcessingPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.from(PaymentProcessingPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
