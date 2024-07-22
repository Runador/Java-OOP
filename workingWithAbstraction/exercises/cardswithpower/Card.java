package workingWithAbstraction.exercises.cardswithpower;

public record Card(RankPowers rankPowers,
                   SuitPowers suitPowers) {

    public RankPowers getRankPowers() {
        return rankPowers;
    }

    public SuitPowers getSuitPowers() {
        return suitPowers;
    }

}
