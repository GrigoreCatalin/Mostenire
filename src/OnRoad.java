public class OnRoad extends Vehicle {
    private int noWheels;
    private int noDoors;

    OnRoad(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    OnRoad(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
        this(serialNumber, noPersons, name);
        this.noWheels = noWheels;
    }

    OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
        this(serialNumber, noPersons, name, noWheels);
        this.noDoors = noDoors;
    }

    @Override
    public boolean goTo(double positionX, double positionY) {
        System.out.println("Driving the vehicle on road to coordinates:" + "[" + positionX + "," + positionY  + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount) {
        System.out.println("Adding " +  amount + " l of fuel to the driving vehicle");
        return true;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        String display = String.format("Driving vehicle properties: %n\t - number of wheels %d %n\t - number of doors: %d",
                this.noWheels, this.noDoors);
        System.out.println(display);
    }

}
