public enum PlanType {

    MONTHLY(1), QUARTERLY(3), ANNUAL(12);

    private final int numberOfMonths;

    PlanType(int numberOfMonths){
        this.numberOfMonths = numberOfMonths;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
}
