
package p4n01;
import java.sql.*;

public class example01 {
    public static void main(String[] args) {
        try{
     
    //step number 1st
        Class.forName("com.mysql.jdbc.Driver");
        
    //step number 2nd
Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/office","root","admin");
//here office is database name, root is username and password
    //Step number 3rd
Statement stmt=con.createStatement();

    //step number 4th
ResultSet rs=stmt.executeQuery("select * from emp");

    //step number 5th get all data from database...
    while(rs.next())
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
    con.close();
    }catch(Exception e)
    { 
        System.out.println(e);
    }
} 
    }

