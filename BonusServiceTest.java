import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000000_60;
        boolean registered = true;
        long expected = 3000;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegistred() {
        BonusService service = new BonusService();



        long amount = 1000_60;
        boolean registered = false;
        long expected = 100;


        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegistredAndLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegistredOverFrange() {
        BonusService service = new BonusService();

        long amount = 1234_5678_90;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegistredUnderFrange() {
        BonusService service = new BonusService();

        long amount = 10;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegistredFrange() {
        BonusService service = new BonusService();

        long amount = 300;
        boolean registered = true;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);

    }
}