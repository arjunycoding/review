package review_project_one.collections;

public class MyString {
    private String stringValue;

    public MyString(String value){
        this.stringValue = value;
    }

    public String getValue() {
        return this.stringValue;
    }

    public boolean equals(Object o){
        if (o instanceof MyString){
            MyString that = (MyString) o;
            System.out.println(String.format("Value One: "));
            return this.stringValue.equals(that.stringValue);
        }
        return false;
    }

    public String toString(){
        return this.stringValue;
    }
}
