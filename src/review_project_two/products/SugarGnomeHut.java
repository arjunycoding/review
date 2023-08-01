package review_project_two.products;

import review_project_two.Building;

public class SugarGnomeHut extends Building {
    public SugarGnomeHut(String name, String color, String purpose) throws Exception {
        super(name, 50, 50, color, false, purpose);
    }
    public void dropCookie(){
        System.out.println("Sorry! You can't drop a cookie here!");
    }

    public void printStatus(){
        System.out.println("Building the castle! ");
    }
}
