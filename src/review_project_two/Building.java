package review_project_two;

import com.sun.jdi.ClassNotLoadedException;

public abstract class Building extends Item{

    protected String purpose;
    public Building(String name, int width, int height, String color, boolean interactive, String purpose) throws Exception{
        super(name, width, height, color, interactive);
        if(name == null || width == 0 || height == 0|| purpose == null){
            Exception e = generateException();
            throw e;
        }
        this.purpose = purpose;
    }
    private Exception generateException(){
        String message = "The required arguments are missing or null";
        return new ClassNotLoadedException("Building", message);
    }
    public abstract void dropCookie();
}
