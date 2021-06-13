package ex26;

import ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_70() {
        double balance, apr, payment;
        balance = 5000;
        apr = 12;
        payment = 100;
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        assertEquals(70, months);
    }

    @Test
    void calculateMonthsUntilPaidOff_0() {
        double balance, apr, payment;
        balance = 0;
        apr = 0;
        payment = 0;
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        assertEquals(0, months);
    }

    @Test
    void calculateMonthsUntilPaidOff_7() {
        double balance, apr, payment;
        balance = 600;
        apr = 1;
        payment = 100;
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        assertEquals(7, months);
    }
}