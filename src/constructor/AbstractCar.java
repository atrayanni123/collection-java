package constructor;

import java.time.LocalDate;

public abstract class AbstractCar {
    protected int wheelCount;
    protected int doorCount;
    protected int wiperCount;
    protected String color;
    protected String modelName;

    protected String makeBy;

    public AbstractCar(String makeBy) {
        this();
        this.makeBy = makeBy;
    }

    public AbstractCar() {
        wheelCount = 4;
        doorCount = 4;
        wiperCount = 2;
    }

    public Float getOnRoadPrice() {
        int roadTax = 10000;
        float basePrice;
        float dealerMargin = 30.999f;

        if (makeBy.equalsIgnoreCase("Maruti Suzki")) {
            basePrice = 100000;
        } else if (makeBy.equalsIgnoreCase("Baleano")) {
            basePrice = 200000;
        } else if (makeBy.equalsIgnoreCase("i20")) {
            basePrice = 300000;
        } else {
            basePrice = 50000;
        }

        float totalCost = (basePrice * dealerMargin) + roadTax;
        return totalCost;
    }

    public abstract LocalDate launchDate();
}