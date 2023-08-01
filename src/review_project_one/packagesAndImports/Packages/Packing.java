package review_project_one.packagesAndImports.Packages; // this packages the file. you start with the head folder(right below src) and if there are sub-folders you add a dot and state the sub-folders

public class Packing {
    public String name;

    public Packing(String name){
        this.name = name;
    }

    public void pack(){
        System.out.println("Start packing " + this.name);
    }
}