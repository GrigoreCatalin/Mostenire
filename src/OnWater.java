public class OnWater extends Vehicle {
    private int noEngines;
    private double cargoCapacity;

    OnWater(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    OnWater(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    OnWater(String serialNumber, int noPersons, String name, int noEngines) {
        this(serialNumber, noPersons, name);
        this.noEngines = noEngines;
    }

    OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity){
        this(serialNumber, noPersons, name, noEngines);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Sailing the vessel to coordinates: " + "[" + positionX + "," + positionY  + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding " + amount + " l of fuel to the vessel");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String display = String.format("Driving vehicle properties: %n\t - number of engines %d %n\t - cargo capacity: %f",
                this.noEngines, this.cargoCapacity);
        System.out.println(display);
    }




}
