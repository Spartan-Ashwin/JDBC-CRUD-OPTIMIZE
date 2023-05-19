import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getAllInfo {


    public void getALLInfo() {

    try {
        Connection con=DbConnection.createConnection();
        PreparedStatement ps=con.prepareStatement("select * from register");
        ResultSet rs=ps.executeQuery();

        while (rs.next()){
            System.out.print(rs.getInt(1));
            System.out.print(", "+rs.getNString(2));
            System.out.print((", "+rs.getNString(3)));
            System.out.println();
        }


    }catch(Exception e){

    }
}
}
