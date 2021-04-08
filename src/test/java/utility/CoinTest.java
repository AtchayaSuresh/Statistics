package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {

    @Test
    void testIfProbabilityOfHeadAndTailAreEqualInCoinIsTrue() {
        Coin coinFacedHead = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedTail = new Coin(Coin.CoinSide.TAIL);

        assertTrue(coinFacedHead.equals(coinFacedTail));
    }

    @Test
    void testIfProbabilityOfHeadAndTailOccurringTogetherIs0_25() {
        Coin coinFacedHeadInFirstToss = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedTailInSecondToss = new Coin(Coin.CoinSide.TAIL);
        double expectedProbability = 0.25;

        double actualProbability = coinFacedHeadInFirstToss.occurringTogetherWith(coinFacedTailInSecondToss);

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    void testIfProbabilityOfHeadAndHeadOccurringTogetherIs0_25() {
        Coin coinFacedHeadInFirstToss = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedHeadInSecondToss = new Coin(Coin.CoinSide.HEAD);
        double expectedProbability = 0.25;

        double actualProbability = coinFacedHeadInFirstToss.occurringTogetherWith(coinFacedHeadInSecondToss);

        assertEquals(expectedProbability, actualProbability);
    }
}
