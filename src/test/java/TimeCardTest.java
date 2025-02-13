import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.TimeCard;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeCardTest {
    private TimeCard timeCard;

    @BeforeEach
    void setUp() {
        timeCard = new TimeCard("123", 30);
    }

    @Test
    void getEmployeeID() {
        assertEquals("123", timeCard.getEmployeeID());
    }

    @Test
    void getHoursWorked() {
        assertEquals(30, timeCard.getHoursWorked());
    }
}