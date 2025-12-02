import java.sql.*;
import java.util.Scanner;


public class App {

    static Connection con;
    static Scanner sc = new Scanner(System.in);
    public static int pin;


    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "Krish@031";

        con = DriverManager.getConnection(url,username,password);

        System.out.println("Enter Your Pin: ");

        pin = sc.nextInt();

        

        while (true){ 
            System.out.println("-----------------Welcome To ATM-------------------");
            System.out.println("1.Show Details");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Change Pin");
            System.out.println("5.Exit");

            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    showDetails();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Choose Correct Option!");
            }
            
        }
    }

    public static void showDetails() throws SQLException{


        Statement stmt = con.createStatement();

        ResultSet rs =stmt.executeQuery("Select * from Customers where password="+pin);

        while(rs.next()){

            int id = rs.getInt("id");
            String name = rs.getString("name");
            int password = rs.getInt("password");
            int balance = rs.getInt("balance");
            System.out.println();
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Password: "+password);
            System.out.println("Balance: "+balance);

        }

        
    } 

    public static void withdraw() throws SQLException{

        int bal = 0;
        int updatedBal;

        System.out.println("Enter Amount To Withdraw: ");
        int withdraw = sc.nextInt();

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select balance from customers where password="+pin);

        while(rs.next()){
            bal = rs.getInt("balance");
        }

        if(withdraw<bal){

            updatedBal = bal - withdraw;

            PreparedStatement ps = con.prepareStatement("UPDATE CUSTOMERS SET balance=? WHERE password=?");
            ps.setInt(1, updatedBal);
            ps.setInt(2, pin);

            int row = ps.executeUpdate();

            if(row>0){
                System.out.println("Amount Withdrawn Successfully!");
                System.out.println("Current Balance: "+updatedBal);
            }
        }
        else{
            System.out.println("Insufficient Balance...");
        }

    }

    public static void deposit() throws SQLException{

        int bal = 0;
        int updatedBal;

        System.out.println("Enter Amount To Deposit: ");
        int deposit = sc.nextInt();

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select balance from customers where password="+pin);

        while(rs.next()){
            bal = rs.getInt("balance");
        }

            updatedBal = bal + deposit;

            PreparedStatement ps = con.prepareStatement("UPDATE CUSTOMERS SET balance=? WHERE password=?");
            ps.setInt(1, updatedBal);
            ps.setInt(2, pin);

            int row = ps.executeUpdate();

            if(row>0){
                System.out.println("Amount Deposited Successfully!");
                System.out.println("Current Balance: "+updatedBal);
            }
        
        

    }

    public static void changePin() throws SQLException{

        System.out.println("Enter New Pin: ");
        int newPin = sc.nextInt();

        PreparedStatement ps = con.prepareStatement("UPDATE CUSTOMERS SET password=? WHERE password="+pin);
        ps.setInt(1, newPin);

        int row = ps.executeUpdate();

        if(row>0){
            System.out.println("Pin Changed Successfully!");
        }
        else{
            System.out.println("Try Again");
        }

    }
}
