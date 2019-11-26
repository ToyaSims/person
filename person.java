import java.util.Arrays;

public class person {
    private String name,gender;
    private int age;
    private String[] interests;
    String interest;

    public person(String name, String gender, int age, String[] interests) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.interests = interests;
        this.interest = "";
    }

    public String hello() {
       // String joinedString = String.join(" ,", this.interests);
        String str = Arrays.toString(this.interests);
        str = str.substring(1, str.length()-1).replace(",", ",");

        return "hello,my name is " + this.name + " and I am " + this.age + " years old.my interests are " + str;
    }


    public static void main(String[] args) {

        person person = new person("Ryan","male",30, new String[] {"being a hardarse", "agile", "ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);

    }

}
