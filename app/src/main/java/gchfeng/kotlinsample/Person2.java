/**
 * Created by gchfeng on 2017/5/26.
 */
public class Person2 {
    private String name;
    private int age;
    private int gender;

    public Person2(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public boolean is() {
        return gender == 1;
    }
}
