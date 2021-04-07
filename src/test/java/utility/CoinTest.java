package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTest {

    @Test
    void testIfProbabilityOfHeadAndTailAreEqualInCoinIsTrue() {
        Coin coinFacedHead = new Coin(Coin.CoinSide.HEAD);
        Coin coinFacedTail =new Coin(Coin.CoinSide.TAIL);

        assertTrue(coinFacedHead.equals(coinFacedTail));
    }
}
