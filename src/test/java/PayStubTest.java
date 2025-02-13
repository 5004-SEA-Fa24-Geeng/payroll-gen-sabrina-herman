import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.PayStub;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayStubTest {

    private PayStub payStub;

    @BeforeEach
    void setUp() {
        payStub = new PayStub("Jane", 30, 2000, 10000, 1000);
    }

    @Test
    void getPay() {
        assertEquals(30, payStub.getPay());
    }

    @Test
    void getTaxesPaid() {
        assertEquals(2000, payStub.getTaxesPaid());
    }

    @Test
    void toCSV() {
        assertEquals("Jane,30.00,2000.00,10000.00,1000.00", payStub.toCSV());
    }
}