import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.PayStub;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayStubTest {

    private PayStub payStub;

    @BeforeEach
    void setUp() {
        payStub = new PayStub("Luffy",1102.24,322.76,21102.24,4852.76);
    }

    @Test
    void getPay() {
        assertEquals(1102.24, payStub.getPay());
    }

    @Test
    void getTaxesPaid() {
        assertEquals(322.76, payStub.getTaxesPaid());
    }

    @Test
    void toCSV() {
        assertEquals("Luffy,1102.24,322.76,21102.24,4852.76", payStub.toCSV());
    }
}