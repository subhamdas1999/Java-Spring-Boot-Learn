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

        String query_1 = "Select \"Name\" from \"Student_SD\" where \"st_id\" = 44";
        //String query_2 = "Select \"Class\" from \"Student_SD\" where \"Name\" = \'Sohini\'";

        ResultSet rs = st.executeQuery(query_1);

        System.out.println(rs.next());

        String ans = rs.getString("Name");
        System.out.println(ans);

// Step 7

        con.close();
        System.out.println("Connect is Closed");

    }

}