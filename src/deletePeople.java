import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletePeople {

    Scanner sc=new Scanner(System.in);
    public  void  deletePeople(){


        try {
            System.out.println("enter id");
            int id=sc.nextInt();
            Connection con=DbConnection.createConnection();
            PreparedStatement ps=con.prepareStatement("delete from register where id=?");
            ps.setInt(1,id);
            int val=ps.executeUpdate();

            if(val>0){
                System.out.println("person deleted successfully");
            }else{
                System.out.println("person can not deleted 1");
            }

        }catch (Exception e){
            System.out.println(e);

        }
    }
}
