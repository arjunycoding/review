package review_project_two.products;

import review_project_two.Building;

public class CookieHouse extends Building {
    public CookieHouse(String name, String color, String purpose) throws Exception{
        super(name, 100, 150, color, false, purpose);
    }
    public void dropCookie(){
        System.out.println("Sorry! You can't drop a cookie here!");
    }

    static void printStatus(){
        System.out.println("Making some star jellies! ");
    }
}
