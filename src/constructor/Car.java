package constructor;

public class Car {
    int wheelCount;
    int doorCount;
    int wiperCount;
    String color;
    String model;
    String makeBy;

    public Car(){
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
    }

    public String getMakeBy() {
        return makeBy;
    }
}