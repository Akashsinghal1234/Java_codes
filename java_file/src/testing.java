public class testing {
    public static void main(String[] args) {
        Person akash = new Person();
    }
}

class Human{
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Person extends Human{
    int salary;
    Person(int salary){
        super(String name, int age);
        this.salary = salary;
    }
}
