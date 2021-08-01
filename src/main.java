public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("3FDS9DFF8FSD7", 4, "Moby");
        vehicle.printInfo();
        vehicle.addFuel(120.2);
        vehicle.goTo(12.4,12.3);

        System.out.println();

        OnRoad car = new OnRoad("FDFL8KMFSDLKM6", 2, "Sporty", 4, 2);
        car.printInfo();
        car.addFuel(100.2);
        car.goTo(3.2, 6.3);

        System.out.println();

        OnWater boat = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000);
        boat.printInfo();
        boat.addFuel(100.5);
        boat.goTo(3.5, 6.9);

        System.out.println();

        OnAir firstPlane = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, "has first class");
        firstPlane.printInfo();
        firstPlane.addFuel(7867);
        firstPlane.goTo(76.1,2.4);
        System.out.println();

        OnAir secondPlane = new OnAir("BC325987DFKJS34", 20, "Localsky", 20, "does not have first class");
        secondPlane.printInfo();
        secondPlane.addFuel(5435.21);
        secondPlane.goTo(12.5,12.4);

    }
}
