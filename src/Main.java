import constructor.Car;

public class Main {
    public static void main(String[] args) {
        /**
         * Static Method Example
         */
//        Car.modelName = "i20";
//        Car.modelName = "Maruti Suzki";
//        Car.modelName = "Baleano";
//        Float i20OnRoadPrice = Car.getOnRoadPrice();
//        System.out.println("Static-example:-  i20OnRoadPrice: " + i20OnRoadPrice);

        /**
         * Non-static Method Examples
         */
        Car marutiCar = new Car("Maruti Suzki");
        Car baleanoCar = new Car("Baleano");
        Car i20Car = new Car("i20");
        Car other = new Car("MG");

        Float marutiCarOnRoadPrice = marutiCar.getOnRoadPrice();
        System.out.println("marutiCarOnRoadPrice: " + marutiCarOnRoadPrice);

        Float baleanoCarOnRoadPrice = baleanoCar.getOnRoadPrice();
        System.out.println("baleanoCarOnRoadPrice: " + baleanoCarOnRoadPrice);

        Float i20CarOnRoadPrice = i20Car.getOnRoadPrice();
        System.out.println("i20CarOnRoadPrice: " + i20CarOnRoadPrice);

        Float otherCarOnRoadPrice = other.getOnRoadPrice();
        System.out.println("otherCarOnRoadPrice: " + otherCarOnRoadPrice);

        /**
         * Access Modifiers Examples
         */
//        System.out.println(cc1.wheelCount);
//        System.out.println(cc1.doorCount);
//        System.out.println(cc1.wiperCount);
//        System.out.println(cc1.color);
//        System.out.println(cc1.model);
//        System.out.println(cc1.makeBy);

//        System.out.println("cc1 = " + cc1.getModel() + ":" + cc1.getDoorCount() + ":" + cc1.getWiperCount() + ":" + cc1.getWheelCount());

//        Car cc2 = new Car("i20");
//        System.out.println("cc2 = " + cc2.getModel() + ":" + cc2.getDoorCount() + ":" + cc2.getWiperCount() + ":" + cc2.getWheelCount());
//
//        Car cc3 = new Car(10);
//        System.out.println("cc3 = " + cc3.getModel() + ":" + cc3.getDoorCount() + ":" + cc3.getWiperCount() + ":" + cc3.getWheelCount());

//        Car cc4 = new Car("creta");
//        System.out.println("cc4 = " + cc4.getModel() + ":" + cc4.getDoorCount() + ":" + cc4.getWiperCount() + ":" + cc4.getWheelCount());
//
//        Car cc5 = new Car("baleno");
//        System.out.println("cc5 = " + cc5.getModel() + ":" + cc5.getDoorCount() + ":" + cc5.getWiperCount() + ":" + cc5.getWheelCount());
    }
}