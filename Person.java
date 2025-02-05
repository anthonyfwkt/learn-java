public class Person {
    private String name;
    private int age;
    public static String Sex="male";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSex() {
        return Sex;
    }

    public static void setSex(String sex) {
        Sex = sex;
    }

    public void showName(){
        System.out.println(name);
        getAgeReturn();

    }
    public int getAgeReturn(){
        return age;
    }

    public static void main(String[] args) {
        Person person=new Person("John",25);
        int age = person.getAgeReturn();
        System.out.println(age);
    }
}



