package java;


class Avengers{

    String f_name, l_name;

    Avengers(String f_name, String l_name){
        this.f_name = f_name;
        this.l_name = l_name;

        System.out.println("My First Name is: "+f_name);
        System.out.println("My Last Name is: "+l_name);
    }

    void display(){
        System.out.println("Hello Avengers");
    }
}
public class MyConstructor {

    public static void main(String[] args){

        Avengers a1 = new Avengers("Steve","Roger");
        Avengers a2 = new Avengers("Tony", "Strak");
        a1.display();

    }
    
}
