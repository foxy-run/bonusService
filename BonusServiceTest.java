import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNotRegistred() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateRegistredAndLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNotRegistredOverFrange() {
        BonusService service = new BonusService();

        long amount = 12_345_678;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNotRegistredUnderFrange() {
        BonusService service = new BonusService();

        long amount = 10000;
        boolean registered = false;
        long expected = 1;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateRegistredFrange() {
        BonusService service = new BonusService();

        long amount = 30000;
        boolean registered = true;
        long expected = 9;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}