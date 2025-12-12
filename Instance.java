package java;

class Car{

    static String model = "Ford";
    static int year;
    void carInfo(){
        System.out.println("Model of Car: "+model+" Launch Year: "+year);
    }
}

public class Instance {

    public static void main(String[] args){

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.year=2023;
        c2.year=2024;
        c3.year=2025;
        c1.model="BMW";
        c2.model="Odi";
        c3.model="Volvo";
        System.out.println("Model of Car: "+c1.model+" Launch Year: "+c1.year); 
        System.out.println("Model of Car: "+c2.model+" Launch Year: "+c2.year);
        System.out.println("Model of Car: "+c3.model+" Launch Year: "+c3.year);

    }
    
}
