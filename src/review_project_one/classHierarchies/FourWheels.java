package review_project_one.classHierarchies;

public abstract class FourWheels extends Vehicle{

    protected boolean isElectric;

    public FourWheels(String brandName, int yearMade, String owner, boolean isElectric){
        super(brandName, 4, yearMade, owner);
        this.isElectric = isElectric;
    }

    public void talk(){
        System.out.println("Hey y'all im a four wheeler vehicle!");
    }
    @Override
    public void playRadio(){
        System.out.println(
                "My heart's a stereo\n" +
                "It beats for you, so listen close\n" +
                "Hear my thoughts in every..."
        );
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Vehicle){
            FourWheels that = (FourWheels) o;
            return this.brandName == that.brandName && this.yearMade == that.yearMade;
        }
        return false;
    }
    public abstract void sayHello();
}
