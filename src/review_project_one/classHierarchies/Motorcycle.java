package review_project_one.classHierarchies;

public class Motorcycle extends TwoWheels{
    public Motorcycle(String brandName, int yearMade, String owner, boolean isOwnerWearingHelmet){
        super(brandName, yearMade, owner, isOwnerWearingHelmet);
    }
    public void sayHello(){
        System.out.println("Good day to you, " + this.owner);
    };
}
