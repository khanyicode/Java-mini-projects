package wethinkcode.cars.v1;

public class Autobahn {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020, "Red");
        Car car2 = new Car("Honda", "Civic", 2019, "Blue");
        Car car3 = new Car("Ford", "Mustang", 2018, "Black");
        Car car4 = new Car("Audi", "A4", 2017, "White");
        Car car5 = new Car("BMW", "X5", 2016, "Silver");
        Car car6 = new Car("Mercedes", "C-Class", 2015, "Gray");
        Car car7 = new Car("Volkswagen", "Golf", 2014, "Green");
        Car car8 = new Car("Chevrolet", "Cruze", 2013, "Yellow");
        Car car9 = new Car("Subaru", "Impreza", 2012, "Orange");

        printCarInfo(car1);
        printCarInfo(car2);
        printCarInfo(car3);
        printCarInfo(car4);
        printCarInfo(car5);
        printCarInfo(car6);
        printCarInfo(car7);
        printCarInfo(car8);
        printCarInfo(car9);

    }

    public static void printCarInfo(Car car) {
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Colour: " + car.getColour());
    }

}

