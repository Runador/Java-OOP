package workingWithAbstraction.lab.hotereservation;

public enum Seasons {

    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private final int pricePerDay;

    Seasons(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }
}
