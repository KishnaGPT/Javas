

import java.sql.*;
import java.util.Scanner;

public class App {

    static Connection con;
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        
        String url = "jdbc:mysql://localhost:3306/Avengers";
        String username = "root";
        String password = "Krish@031";

        con = DriverManager.getConnection(url, username, password);

        while(true){

            System.out.println();
            System.out.println("Welcome to Avengers!");
            System.out.println("1. View Avengers");
            System.out.println("2. Add Avengers");
            System.out.println("3. Update Avengers");
            System.out.println("4. Delete Avengers");
            System.out.println("5. Exit");

            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    viewAvenger();
                break;
                    
                case 2:
                    addAvenger();
                break;

                case 3:
                    updateAvenger();
                break;

                case 4:
                    deleteAvenger();
                break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    con.close();
                    return;
                
                default:
                    System.out.println("Select Correct Choice...");
            }   
        }
        
    }

    public static void viewAvenger() throws SQLException{

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from Avengers");
        while(rs.next()){
            int id = rs.getInt("ar_id");
            String f_name = rs.getString("f_name");
            String l_name = rs.getString("l_name");
            String heroic_name = rs.getString("heroic_name");
            String city = rs.getString("city");

            System.out.println("[ "+id+", "+f_name+" "+l_name+", "+heroic_name+", "+city+"]");
        }
        

    }

    public static void addAvenger() throws SQLException{
        System.out.println("Enter First Name: ");
        String f_name = sc.next();
        System.out.println("Enter Last Name: ");
        String l_name = sc.next();
        System.out.println("Enter Heroic Name: ");
        String heroic_name = sc.next();
        System.out.println("Enter City Name: ");
        String city = sc.next();
        PreparedStatement ps = con.prepareStatement("INSERT INTO AVENGERS(f_name, l_name, heroic_name, city) VALUES(?,?,?,?)");
        
        ps.setString(1, f_name);
        ps.setString(2, l_name);
        ps.setString(3, heroic_name);
        ps.setString(4, city);

        int row = ps.executeUpdate();

        if(row>0){

            System.out.println();
            System.out.println("Avenger Added Sucessfully!");
        }
        else{
            System.out.println("Something Went Wrong...Try Again!");
        }
    }

    public static void updateAvenger() throws SQLException{

        System.out.println("Enter First Name of Hero You Want To Update: ");
        String f_name = sc.next();
        System.out.println("Enter New Heroic Name: ");
        String heroic_name = sc.next();

        PreparedStatement ps = con.prepareStatement("UPDATE AVENGERS SET heroic_name=? WHERE f_name=?");

        ps.setString(1, heroic_name);
        ps.setString(2, f_name);

        int row = ps.executeUpdate();

        if(row>0){
            System.out.println("Avenger Updated Suceesfully!");
        }
        else{
            System.out.println("Something Went Wrong...Try Again!");
        }

    }

    public static void deleteAvenger()throws SQLException{

        System.out.println("Enter Heroic Name You Want To Delete: ");
        String heroic_name = sc.next();

        PreparedStatement ps = con.prepareStatement("DELETE FROM AVENGERS WHERE heroic_name=?");

        ps.setString(1, heroic_name);

        int row = ps.executeUpdate();

        if(row>0){
            System.out.println("Avenger Deleted Suceesfully!");
        }
        else{
            System.out.println("Something Went Wrong...Try Again!");
        }
    }
}
