package ucu.edu.ua.flower.controller;


import org.springframework.web.bind.annotation.*;
import ucu.edu.ua.flower.model.Item;
import ucu.edu.ua.flower.model.Order;
import ucu.edu.ua.flower.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.flower.payment.CreditCardPaymentStrategy;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @PostMapping("/create")
    public String createOrder(@RequestBody List<Item> items) {
        Order order = new Order(items);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new CreditCardPaymentStrategy());

        return order.processOrder() ? "Order processed successfully" : "Order processing failed";
    }
}

