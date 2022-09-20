package constructor;

public class Car {
    protected int wheelCount;
    protected int doorCount;
    protected int wiperCount;
    protected String color;
    protected String modelName;

    protected String makeBy;

    public Car(String makeBy) {
        this();
        this.makeBy = makeBy;
    }

    public Car() {
        wheelCount = 4;
        doorCount = 4;
        wiperCount = 2;
    }

//    public Car(){
//        System.out.println(wheelCount);
//        System.out.println(doorCount);
//        System.out.println(wiperCount);
//        System.out.println(color);
//        System.out.println(model);
//        System.out.println(makeBy);
//    }

    /*public Car(){
        wheelCount = 4;
        doorCount = 4;
        wiperCount = 2;
    }

    public Car(String modelName){
        this();
        model = modelName;
    }

    public Car(int wiperCount){
        this();
        this.wiperCount = wiperCount;
    }

    //constructor overloading
    public Car(String makeByName, String modelName){
        this(modelName);
        makeBy = makeByName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public int getWiperCount() {
        return wiperCount;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }*/

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
}