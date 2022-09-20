package constructor;

import java.util.Date;

public class BalenoCar extends Car {

    public Float getOnRoadPrice() {
        int roadTax = 10000;
        float basePrice = 10000;
        float dealerMargin = 20.999f;

        float totalCost = (basePrice * dealerMargin) + roadTax;
        return totalCost;
    }
}
