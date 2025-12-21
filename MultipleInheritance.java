package java;
public class MultipleInheritance {
    
    public static void main(String[] args){
        Krishna k1 = new Krishna();
        k1.display();
    }
}

interface Papa{
    int x=10;
}

interface Mummy{
    int y=20;
}

interface Krish extends Papa, Mummy{
    void display();
}

class Krishna implements Krish{

    public void display(){
        System.out.println("Value of X: "+Papa.x);
        System.out.println("Value of Y: "+Mummy.y);
    }
}

