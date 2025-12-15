package java;
public class MethodOverriding {
    
    public static void main(String[] args){
        School s = new School();
        s.disp();
    }
}

class College{

    void disp(){
        System.out.println("Inside College Class");
    }
}

class School extends College{

    void disp(){
        
        super.disp();
        System.out.println("Inside School Class");
        
    }
}
