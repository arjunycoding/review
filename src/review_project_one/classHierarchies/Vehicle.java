package review_project_one.classHierarchies;

public abstract class Vehicle {

    protected String brandName;
    protected int numberOfWheels;
    protected int yearMade;
    protected String owner;

    public Vehicle(String brandName, int numberOfWheels, int yearMade, String owner){
        this.brandName = brandName;
        this.numberOfWheels = numberOfWheels;
        this.yearMade = yearMade;
        this.owner = owner;
    }

    public abstract void talk();
    public abstract void playRadio();

    @Override
    public String toString(){
        return "this " + this.brandName + " was made in " + this.yearMade;
    }

}
