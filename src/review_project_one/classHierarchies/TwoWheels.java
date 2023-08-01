package review_project_one.classHierarchies;

public abstract class TwoWheels extends Vehicle{
    protected boolean isOwnerWearingHelmet;

    public TwoWheels(String brandName, int yearMade, String owner, boolean isOwnerWearingHelmet){
        super(brandName, 4, yearMade, owner);
        this.isOwnerWearingHelmet = isOwnerWearingHelmet;

    }

    public void talk(){
        System.out.println("Im a two wheeler vehicle!");
    }
    public void playRadio(){
        System.out.println(
            "You see, tonight, it could go either way\n" +
            "Hearts balanced on a razor blade\n" +
            "We are designed to love..."
        );
    }

    public void warnDriver(){
        if(isOwnerWearingHelmet){
            System.out.println("Hey buddy, good job. you're wearing a helmet");
        } else {
            System.out.println("Hey! I'm not gonna start get your helmet on!");
        }
    }

    public boolean equals(Object o){
        if (o instanceof Vehicle){
            TwoWheels that = (TwoWheels) o;
            return this.brandName.equals(that.brandName) && this.yearMade == that.yearMade;
        }
        return false;
    }

    public abstract void sayHello();
}
