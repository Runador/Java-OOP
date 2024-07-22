package workingWithAbstraction.lab.hotereservation;

public enum Discounts {

    VIP(20),
    SecondVisit(10),
    None(0);

    private final int percent;

    Discounts(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
