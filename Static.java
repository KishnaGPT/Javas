package java;


class Car{

    String model = "Ford";
    int year;

    void carInfo(){
        System.out.println("Model of Car: "+model+" Launch Year: "+year);
    }
}

public class Static {    

    public static void main(String[] args) {
        Car m1 = new Car();

        m1.year=2025;
        m1.model="BMW";
        m1.carInfo();
    }
}
