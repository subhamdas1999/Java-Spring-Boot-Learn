import java.sql.*;

public class DemoJdbc {
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

        Statement st = con.createStatement();

// Step 6 ( Execute Statement )

        String query_3 =  "select * from \"Student_SD\"";

        ResultSet rs = st.executeQuery(query_3);

        while(rs.next()){

            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2)+ " ");
            System.out.print(rs.getString(3));

            System.out.println();
        }
// Step 7

        con.close();
        System.out.println("Connect is Closed");

    }

}
