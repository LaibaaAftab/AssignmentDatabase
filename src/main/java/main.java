import java.util.UUID;
import java.sql.*;

public class main {
    public static void main(String[] args)
    {
        Date date = new Date(0);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/assignment";
            Connection con=DriverManager.getConnection(url,"root","root");
//            String query = "INSERT INTO reservations(id,check_in_date,check_out_date,status)VALUES(?,?,?,?)";
//            PreparedStatement st=con.prepareStatement(query);
//
//            st.setObject(1,UUID.randomUUID().toString());
//            st.setDate(2,date.valueOf("2022-10-07"));
//            st.setDate(3,date.valueOf("2022-10-10"));
//            st.setString(4,"checkedin");
//            int rs = st.executeUpdate();

            // String query2 = "INSERT INTO guests(id_fk,reservation_id,first_name,last_name)VALUES('"+UUID.randomUUID()+"','1','batool','fatima')";
            //int rs2 = st.executeUpdate(query2);


            String query2 = "INSERT INTO guests(id,reservation_id,first_name,last_name)VALUES('a884448b-c39e-4341-a8a6-f9057582d7f9','7','Laiba','aftab')";
            Statement st=con.createStatement();
            int rs = st.executeUpdate(query2);

            if(rs==1 ) //|| rs2 ==1
            {
                System.out.println("successfully entered");
            }

            else
            {
                System.out.println("couldn't entered data");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

//String query = "INSERT INTO reservations(id,check_in_date,check_out_date,status)VALUES('"+UUID.randomUUID()+"','2029-07-07'"+",'2030-07-10'"+",'checked')";
