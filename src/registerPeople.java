import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class registerPeople {

    Scanner sc=new Scanner(System.in);
    public void registerPeople(){


        try{
            System.out.println("enter id");
            int id=sc.nextInt();
            System.out.println("enter email");
            String email=sc.next();
            System.out.println("enter phone");
            String phone=sc.next();

            //System.out.println(id+" "+email+" "+phone);

            Connection con=DbConnection.createConnection();
            Statement sta=con.createStatement();
            int val=sta.executeUpdate("insert into register values('"+id+"','"+email+"','"+phone+"')");

            if(val>0)
            System.out.println("people added successfully");
            else
                System.out.println("people can not be added into database");

        }catch (Exception e){

            System.out.println("people can not be added into database");
        }
    }
}
