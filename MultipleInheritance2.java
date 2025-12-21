package java;
public class MultipleInheritance2 {
    
    public static void main(String[] args){

        MySon m1 = new MySon();
        m1.display();
    }
}

class MyFather{
    public int x=10;
    public int y=30;
}

interface MyMother{
    int y=20;
}

class MySon extends MyFather implements MyMother {

    public void display(){

        System.out.println("Value of X: "+x);
        System.out.println("Value of Y: "+MyMother.y);
        System.out.println("Value of Y: "+super.y);

    }
}