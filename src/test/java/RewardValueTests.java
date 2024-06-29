import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void convert_from_cash_to_miles() {
        // Test conversion from cash to miles
        double cashAmount = 100.0; // Example cash value
        RewardValue rewardValue = new RewardValue(cashAmount);

        // Expected miles value (cashAmount / 0.0035)
        double expectedMiles = cashAmount / 0.0035;

        // Assert the conversion from cash to miles
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.0001);
    }

    @Test
    public void convert_from_miles_to_cash() {
        // Test conversion from miles to cash
        int milesAmount = 10000; // Example miles value
        RewardValue rewardValue = new RewardValue(milesAmount);

        // Expected cash value (milesAmount * 0.0035)
        double expectedCash = milesAmount * 0.0035;

        // Assert the conversion from miles to cash
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.0001);
    }
}
