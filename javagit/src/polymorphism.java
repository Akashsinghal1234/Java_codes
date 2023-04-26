
public class polymorphism {

    public static void main(String[] args) {

        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x : racers) {
            x.go();
        }

    }
}
//**************************************
public class Vehicle {

    public void go() {
        // TODO Auto-generated method stub

    }
}
//**************************************
public class Car extends Vehicle{


    @Override
    public void go() {
        System.out.println("*The car begins moving*");
    }
}
//**************************************
public class Bicycle extends Vehicle{


    @Override
    public void go() {
        System.out.println("*The bicycle begins moving*");
    }
}
//**************************************
public class Boat extends Vehicle{


    @Override
    public void go() {
        System.out.println("*The boat begins moving*");
    }
}