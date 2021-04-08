package utility;

import java.util.Objects;

public class Coin {
    private final CoinSide coinSide;

    public Coin(CoinSide coinSide) {
        this.coinSide = coinSide;
    }

    public double probabilityOfNonOccurrence() {
        return 1-coinSide.getProbability();
    }

    public enum CoinSide {
        TAIL(0.5),
        HEAD(0.5);

        private final double probability;

        CoinSide(double probability) {
            this.probability = probability;
        }

        public double getProbability() {
            return probability;
        }
    }

    public double probabilityOfOccurringTogether(Coin coin) {
        if(coin.coinSide!=this.coinSide)
            return coin.coinSide.getProbability();
        return this.coinSide.getProbability() * coin.coinSide.getProbability();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return coinSide.getProbability() == coin.coinSide.getProbability();
    }

    @Override
    public int hashCode() {
        return Objects.hash(coinSide);
    }
}
