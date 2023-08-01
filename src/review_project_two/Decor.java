package review_project_two;

import com.sun.jdi.ClassNotLoadedException;

public abstract class Decor extends Item{
    protected int visualAppealLevel;
    public Decor(String name, int width, int height, String color, boolean interactive, int visualAppealLevel) throws Exception{
        super(name, width, height, color, interactive);
        if(name == null || width == 0 || height == 0 || visualAppealLevel == 0){
            Exception e = generateException();
            throw e;
        }
        this.visualAppealLevel = visualAppealLevel;

    }

    private Exception generateException(){
        String message = "The required arguments are missing or null";
        return new ClassNotLoadedException("Building", message);
    }
    public abstract void dropCookie();
}
