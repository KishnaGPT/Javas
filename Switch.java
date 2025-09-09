package Java;

public class Switch {
    
    public static void main(String[] args){

        String fruit = "apple";

        switch(fruit){
            case "banana":
                System.out.println("Banana is Yellow");
                break;
            case "apple":
                System.out.println("Apple is Red");
                break;
            case "orange":
                System.out.println("Orange is orange");
                break;
            default:
                System.out.println("I don't know the color of this fruit");
        }
    }
}
