package constructor;

import java.time.LocalDate;

public class i20Car extends AbstractCar {

    public Float getOnRoadPrice() {
        int roadTax = 10000;
        float basePrice = 10000;
        float dealerMargin = 20.999f;

        float totalCost = (basePrice * dealerMargin) + roadTax;
        return totalCost;
    }

    @Override
    public LocalDate launchDate() {
        return LocalDate.of(2025, 10, 21);
    }
}
