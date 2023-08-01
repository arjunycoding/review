package review_project_one.classHierarchies;

public class Car extends FourWheels{
    public Car(String brandName, int yearMade, String owner, boolean isElectric){
        super(brandName, yearMade, owner, isElectric);
    }
    public void sayHello(){
        System.out.println("Hop in, " + this.owner);
    };
}
