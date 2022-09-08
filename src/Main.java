import constructor.Car;

public class Main {
    public static void main(String[] args) {
        Car cc1 = new Car();
        System.out.println("cc1 = " + cc1.getModel() + ":" + cc1.getDoorCount() + ":" + cc1.getWiperCount() + ":" + cc1.getWheelCount());

        Car cc2 = new Car("i20");
        System.out.println("cc2 = " + cc2.getModel() + ":" + cc2.getDoorCount() + ":" + cc2.getWiperCount() + ":" + cc2.getWheelCount());

        Car cc3 = new Car(10);
        System.out.println("cc3 = " + cc3.getModel() + ":" + cc3.getDoorCount() + ":" + cc3.getWiperCount() + ":" + cc3.getWheelCount());

//        Car cc4 = new Car("creta");
//        System.out.println("cc4 = " + cc4.getModel() + ":" + cc4.getDoorCount() + ":" + cc4.getWiperCount() + ":" + cc4.getWheelCount());
//
//        Car cc5 = new Car("baleno");
//        System.out.println("cc5 = " + cc5.getModel() + ":" + cc5.getDoorCount() + ":" + cc5.getWiperCount() + ":" + cc5.getWheelCount());


    }
}