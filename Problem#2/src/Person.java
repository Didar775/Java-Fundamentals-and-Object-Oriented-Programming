public class Person {
    private String name;
    private String surname;
    private int age;
    public Gender gender;
    public Person(){};
    public Person(String name){
        this();
    };
    public  Person(String name, String surname){
        this(name);
        this.surname = surname;
    }
    public Person(String name, String surname,int age){
        this(name,surname);
        this.age = age;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

}
