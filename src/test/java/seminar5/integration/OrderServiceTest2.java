package seminar5.integration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest2 {
    PaymentService paymentService;
    OrderService orderService;

    @BeforeEach
    void setUp() {
        paymentService = new PaymentService();
        orderService = new OrderService(paymentService);
    }

    @Test
    void placeOrder() {
        Assertions.assertTrue(orderService.placeOrder("1", 32));
    }
}
