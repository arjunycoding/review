package review_project_two;

import review_project_two.products.CookieHouse;
import review_project_two.products.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            CookieHouse cookieHouse1 = new CookieHouse("Strawberry Cookies house", "Red", "To create star jellies");
            CookieHouse cookieHouse2 = new CookieHouse("Strawberry Cookies house", "Red", "To create star jellies bags");
            CookieHouse cookieHouse3 = new CookieHouse("Strawberry Cookies house", "Red", "To create star jellies bags");


            List trees = new ArrayList<Tree>();
            trees.add(new Tree("Tree 1", "Brown", 4));
            trees.add(new Tree("Tree 2", "Orange", 3));
            trees.add(new Tree("Tree 3", "Green", 7));
            trees.add(new Tree("Tree 4", "Brown", 1));
            trees.add(new Tree("Tree 5", "Yellow", 6));
            trees.add(new Tree("Tree 6", "Purple", 3));
            trees.add(new Tree("Tree 1", "Brown", 4));
            trees.add(new Tree("Tree 1", "Brown", 4));


            trees.forEach(System.out::println);
            System.out.println("================= SET ================");
            Set hello = new HashSet<Tree>();
            hello.add(new Tree("Tree 1", "Brown", 4));
            hello.add(new Tree("Tree 2", "Orange", 3));
            hello.add(new Tree("Tree 3", "Green", 7));
            hello.add(new Tree("Tree 4", "Brown", 1));
            hello.add(new Tree("Tree 5", "Yellow", 6));
            hello.add(new Tree("Tree 6", "Purple", 3));


            hello.forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
