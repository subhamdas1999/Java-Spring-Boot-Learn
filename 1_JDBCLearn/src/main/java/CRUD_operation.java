import java.sql.*;

public class CRUD_operation {
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


// =================================== Insert  Query ====================================

/*
             String query =  "insert into \"Student_SD\" values (78,'Danny','Class 31')";
             boolean status = st.execute(query);
             System.out.println(status);
*/





// ======================================== Read  Query ====================================

/*
                         String query =  "select * from \"Student_SD\"";
                        ResultSet rs = st.executeQuery(query);
                                while(rs.next()){

                                    System.out.print(rs.getInt(1) + " ");
                                    System.out.print(rs.getString(2)+ " ");
                                    System.out.print(rs.getString(3));

                                    System.out.println();
                                }


*/






// ====================================  Update  Query  ====================================

/*
               String query =  "update \"Student_SD\" set \"Name\" = 'Suproteam' where \"st_id\" = 2";

               boolean status = st.execute(query);
               System.out.println(status);

*/

//==================================Delete  Query   ================================================


/*
        String query =  "delete from \"Student_SD\" where \"st_id\" = 2";
        boolean status = st.execute(query);
        System.out.println(status);


*/

// Step 7 ( CLose the Connection )

        con.close();
        System.out.println("Connect is Closed");

    }

}
