public class ServiceStation  {

    public static void check(Car car) {
    checkTransport(car);
    car.checkEngine();
    System.out.println();
    }

    public static void check(Truck truck){
    checkTransport(truck);
    truck.checkEngine();
    truck.checkTrailer();
    System.out.println();
    }


    public static void check(Bicycle bicycle) {
    checkTransport(bicycle);
    System.out.println();
    }
    private static void checkTransport(WheelTransport wheelTransport) {
        System.out.println("Обслуживаем " + wheelTransport.getModelName());
        for (int i = 0; i < wheelTransport.getWheelsCount(); i++) {
            wheelTransport.updateTyre();
        }
    }
}


