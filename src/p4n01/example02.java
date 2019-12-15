
package p4n01;
import java.sql.*;
import java.util.Scanner;
public class example02 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
Class.forName("com.mysql.jdbc.Driver");

int a;
String name,address;

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/office","root","admin");

PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?)");

            System.out.println("plz enter id number :- ");
            a=sc.nextInt();
            System.out.println("plz enter name :- ");
            name=sc.next();
            System.out.println("plz enter Address:- ");
            address=sc.next();
            stmt.setInt(1,a);//1 specifies the first parameter in the query
            stmt.setString(2,name);
            stmt.setString(3,address);

int i=stmt.executeUpdate();
System.out.println(i+" records inserted");

con.close();

}catch(Exception e){ System.out.println(e);}

} 
    }

