package review_project_two;

import com.sun.jdi.ClassNotLoadedException;

public abstract class Item {
    protected String name;
    protected int width;
    protected int height;
    protected String color;
    protected boolean interactive;

    public Item(String name, int width, int height, String color, boolean interactive) throws Exception{
        if(name == null || width == 0 || height == 0 || color == null){
            Exception e = generateCompilietimeException();
            throw e;
        } else if(height > 200 || width > 200){
            Exception e = generateRuntimeException();
            throw e;
        }
        this.name = name;
        this.width = width;
        this.height = height;
        this.color = color;
        this.interactive = interactive;

    }

    private Exception generateCompilietimeException(){
        String message = "The required arguments are missing or null";
        return new ClassNotLoadedException("Building", message);
    }
    private Exception generateRuntimeException(){
        return new RuntimeException("Sorry but the width and height cannot be above 200");
    }

    public abstract void dropCookie();


    public String toString(){
        return this.name;
    }

    public boolean equals(Object o){
        if(o instanceof Item){
            Item that = (Item) o;
            return this.name.equals(that.name);

        }
        return false;
    }
}
