package java;
public class Final {
    
    public static void main(String[] args){

        Avenger a = new Avenger(20);
        a.display();
    }
    
}

// class Avenger{

//         final int x=10;
//         void display(){
//             System.out.println(x);
//         }
//     }


class Avenger{

    final int x;

    Avenger(int x){
        this.x = x;
    }

    void display(){
        System.out.println(x);
    }
    
}
