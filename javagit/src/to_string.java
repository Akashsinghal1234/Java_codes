
//***************************************
public class to_string {

    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car1 = new Car();


        System.out.println(car1.toString());

        // or

        System.out.println(car1);


    }
}
//***************************************
public class Car {


    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String toString() {

        return make +"\n"+model+"\n"+color+"\n"+year;

    }
}
//*************************