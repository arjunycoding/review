package review_project_two.products;

import review_project_two.Decor;

public class SodaStream extends Decor {
    public SodaStream(String name, int width, int height, String color, int visualAppealLevel) throws Exception{
        super(name, width, height, color, true, visualAppealLevel);
    }
    public void dropCookie(){
        System.out.println("Your cookie is now swimming!");
    }

}
