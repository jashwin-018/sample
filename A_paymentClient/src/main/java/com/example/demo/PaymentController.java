package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/makePayment")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment) {
        Payment savedPayment = paymentService.makePayment(payment);

        // Send a simple email receipt
        sendEmailReceipt(savedPayment);

        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }

    private void sendEmailReceipt(Payment payment) {
        // Implement email sending logic here using Spring Mail
        // This is a simplified example and should be configured in a real application.
        // For sending emails, you can use JavaMailSender or other email libraries.

        // For this example, we'll just print a simple email receipt.
        System.out.println("Email Receipt:");
        System.out.println("Order ID: " + payment.getOrderId());
        System.out.println("Amount: $" + payment.getAmount());
        System.out.println("Payment Status: " + payment.getPaymentStatus());
        System.out.println("Thank you for your payment!");
    }
}
