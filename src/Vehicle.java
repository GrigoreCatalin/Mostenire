public class Vehicle {
    private final String serialNumber;
    private int noPersons;
    private String name;

    Vehicle (String serialNumber, int noPersons){
        this.serialNumber = serialNumber;
        this.noPersons = noPersons;
    }

    Vehicle (String serialNumber, int noPersons, String name){
        this(serialNumber,noPersons);
        this.name = name;
    }

    public final String getSerialNumber(){
        return this.serialNumber;
    }

    public boolean goTo (double positionX, double positionY){
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }

    public boolean addFuel(double amount){
        System.out.println("Error: unknown type of vehicle…");
        return false;
    }

    public void printInfo(){
        String display = String.format("Vehicle properties: %n\t - serial number: %s %n\t - capacity: %d persons %n\t - name: %s",
                this.serialNumber, this.noPersons, this.name);
        System.out.println(display);
    }

}
