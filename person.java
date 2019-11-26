import java.util.Arrays;

public class person {
    private String name,gender;
    private int age;
    private String[] interests;


    public person(String name, String gender, int age, String[] interests) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.interests = interests;

    }

    public String hello() {
       String str = String.join(" ,", this.interests);

        str = str.substring(0,str.lastIndexOf( ',' )) + " and " + str.substring(str.lastIndexOf(",") + 1);

        return "hello,my name is " + this.name + " and I am " + this.age + " years old.my interests are " + str;
    }


    public static void main(String[] args) {

        person person = new person("Ryan","male",30, new String[] {"being a hardarse", "agile", "ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);

    }

}
