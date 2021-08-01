public class OnAir extends Vehicle {
    private int noTurbines;
    private String hasFirstClass;

    OnAir(String serialNumber, int noPersons) {
        super(serialNumber, noPersons);
    }

    OnAir(String serialNumber, int noPersons, String name) {
        super(serialNumber, noPersons, name);
    }

    OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
        this(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }

    OnAir(String serialNumber, int noPersons, String name, int noTurbines, String hasFirstClass) {
        this(serialNumber, noPersons, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Flying the airplane to coordinates: " + "[" + positionX + "," + positionY  + "]");
        return true;
    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding " + amount + " l of fuel to the airplane");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String display = String.format("Airplane properties: %n\t - number of turbines: %d %n\t - %s",
                this.noTurbines, this.hasFirstClass);
        System.out.println(display);
    }


}

