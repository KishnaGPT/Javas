package java;

class Sum{

    int x=10;
    int y=20;
    int total;

    void add(){
        total = x+y;
        System.out.println("Addition of "+x+" and "+y+" is: "+total);
    }
}

class ParameterSum{

    void add(int x, int y){
        int p = x;
        int q = y;
        int total = p+q;
        System.out.println("Addition of "+p+" and "+q+" is: "+total);
    }
}

class ReturnSum{

    int add(int x, int y){

        int p = x;
        int q = y;

        int total = p+q;
        return total;
    }
}


public class Method {
    
    public static void main(String[] args){

        Sum s1 = new Sum();
        s1.add();

        System.out.println("Parameterized Addition");
        ParameterSum ps = new ParameterSum();
        ps.add(20, 30);
        
        System.out.println("Parameterized Return Addition");
        ReturnSum rs = new ReturnSum();
        int result = rs.add(100,200);
        System.out.println(result);
    }
}
