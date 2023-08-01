package review_project_two.products;

import review_project_two.Decor;

public class Tree extends Decor {
    public Tree(String name, String color, int visualAppealLevel) throws Exception{
        super(name, 10, 10, color, true, visualAppealLevel);
    }
    public void dropCookie(){
        System.out.println("Sorry! You can't drop a cookie here!");
    }
}
