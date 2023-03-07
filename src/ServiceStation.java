public class ServiceStation implements checkTransport {
@Override
    public void check(Car car) {
    checkTransport(car);
    car.checkEngine();
    System.out.println();
    }
@Override
    public void check(Truck truck){
    checkTransport(truck);
    truck.checkEngine();
    truck.checkTrailer();
    System.out.println();
    }

@Override
    public void check(Bicycle bicycle) {
    checkTransport(bicycle);
    System.out.println();
    }
    private void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}


