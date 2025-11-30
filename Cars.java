package java;

    class Feature{
        int speed = 100;
        int price = 100000;
        int add;
        void display(){
            add = speed+price;
        }

    public class Cars{
        public static void main(String[] args)
        {
            Feature f1 = new Feature();
            System.out.println("Speed: "+f1.speed);
            System.out.println("Price: "+f1.price);
            f1.display();
            System.out.println("Addition: "+f1.add);
        }
    }
}
