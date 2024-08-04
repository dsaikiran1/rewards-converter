import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

       private static final double miles_to_cash_rate = 0.0035;
    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var miles = new MilesValue(milesValue);
        assertEquals(milesValue, miles.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double milesValue = cashValue/miles_to_cash_rate;
        assertEquals(milesValue,rewardValue.getMilesValue());    
        //assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 100;
        var miles = new MilesValue(milesValue);
        double cashValue = milesValue*miles_to_cash_rate;
        assertEquals(cashValue,miles.getCashValue());
        //assert false;
    }
}
