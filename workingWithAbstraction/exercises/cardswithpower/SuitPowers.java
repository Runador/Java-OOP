package workingWithAbstraction.exercises.cardswithpower;

public enum SuitPowers {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int suit;

    SuitPowers(int suit) {
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

}
