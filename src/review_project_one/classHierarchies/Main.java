package review_project_one.classHierarchies;

public class Main {
    public static void main(String[] args) {
//      This is an example of a class hierarchies. Vehicles is the grandparent class. Then we have the TwoWheels and FourWheels which inherit the same properties with a few new review_project_one.variables. After that we have car and motorcycle which are the children review_project_one.classes.
        Car car = new Car("Honda", 2016, "Arjun Yuvaraj", true);
        Car car1 = new Car("Honda", 2016, "Adhithya Yuvaraj", false);
        Motorcycle motorcycle = new Motorcycle("Tesla", 2023, "Vidya Yuvaraj", true);
        Motorcycle motorcycle1 = new Motorcycle("Tesla", 2023, "Yuvaraj Mahendran", false);
        System.out.println("============= Car ==============");
        car.sayHello();
        car.playRadio();
        car.talk();
        car.toString();
        System.out.println(car.equals(car1));
        System.out.println("========== Motorcycle ==========");
        motorcycle.sayHello();
        motorcycle.playRadio();
        motorcycle.talk();
        motorcycle.toString();
        motorcycle.warnDriver();
        System.out.println("Arjun's equals: " + motorcycle.equals(motorcycle1));


        Motorcycle m1 =new Motorcycle("Tesla", 2023, "Vidya Yuvaraj", true);
        Motorcycle m2 =new Motorcycle("Tesla", 2023, "Vidya Yuvaraj", true);

        System.out.println("test Yuva added: " + m1.equals(m2));
        System.out.println("are these equal?: " + ("Yuva" == "Yuva"));
    }
}
