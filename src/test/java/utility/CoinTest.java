package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {

    @Test
    void testIfProbabilityOfHeadAndTailAreEqualInCoinIsTrue() {
        Coin coinFacedHead = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedTail = new Coin(Coin.CoinSide.TAIL);

        assertEquals(coinFacedHead,coinFacedTail);
    }

    @Test
    void testIfProbabilityOfHeadAndTailOccurringTogetherIs0_25() {
        Coin coinFacedHeadInFirstToss = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedTailInSecondToss = new Coin(Coin.CoinSide.TAIL);
        double expectedProbability = 0.5;

        double actualProbability = coinFacedHeadInFirstToss.probabilityOfOccurringTogether(coinFacedTailInSecondToss);

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    void testIfProbabilityOfHeadAndHeadOccurringTogetherIs0_25() {
        Coin coinFacedHeadInFirstToss = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedHeadInSecondToss = new Coin(Coin.CoinSide.HEAD);
        double expectedProbability = 0.25;

        double actualProbability = coinFacedHeadInFirstToss.probabilityOfOccurringTogether(coinFacedHeadInSecondToss);

        assertEquals(expectedProbability, actualProbability);
    }

    @Test
    void testIfProbabilityOfNonOccurrenceOfHeadIs0_5() {
        Coin coinFacedHead = new Coin(Coin.CoinSide.HEAD);
        double expectedProbability=0.5;

        double actualProbability=coinFacedHead.probabilityOfNonOccurrence();

        assertEquals(expectedProbability,actualProbability);
    }

    @Test
    void testIfProbabilityOfNonOccurrenceOfTailIs0_5() {
        Coin coinFacedTail = new Coin(Coin.CoinSide.TAIL);
        double expectedProbability=0.5;

        double actualProbability=coinFacedTail.probabilityOfNonOccurrence();

        assertEquals(expectedProbability,actualProbability);
    }
}
