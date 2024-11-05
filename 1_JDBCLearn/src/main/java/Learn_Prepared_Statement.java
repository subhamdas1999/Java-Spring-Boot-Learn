import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class Learn_Prepared_Statement {
    public static void main(String[] args) throws Exception{

// Step 2 and 3 ( Optional / not needed now , After JAVA 8 )
        Class.forName("org.postgresql.Driver");

// Step 4
        String url ="jdbc:postgresql://localhost:5432/Demo_SD";
        String user = "postgres";
        String pass = "Delta@0000";

        Connection con = DriverManager.getConnection(url,user,pass);

        System.out.println("Connect is Established");

// Step 5 ( Create Statement )

//        Statement st = con.createStatement();

// Step 6 ( Execute Statement )


// =================================== Insert  Query ====================================

        int Student_id = 110;
        String Student_name = "Palas";
        String Student_Class = "Class 7";


        String sql =  "insert into \"Student_SD\" values (?,?,?)";


        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1,Student_id);
        ps.setString(2,Student_name);
        ps.setString(3,Student_Class);

        ps.execute();

// Step 7 ( CLose the Connection )

        con.close();
        System.out.println("Connect is Closed");

    }

}
