import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatePeople {

    Scanner sc=new Scanner(System.in);
    public  void updatePeople(){


        try{
            Connection con=DbConnection.createConnection();
            System.out.println("enter id");
            int id=sc.nextInt();
            System.out.println("what your want to update\n1.email\n2.phone");
            int n=sc.nextInt();
            int val=0;
            if(n==1){
                System.out.println("enter email");
                String email=sc.next();
                PreparedStatement ps=con.prepareStatement("update register set email=? where id=?");
                ps.setString(1,email);
                ps.setInt(2,id);
                val=ps.executeUpdate();
            }else if(n==2){
                System.out.println("enter phone");
                String phone=sc.next();
                PreparedStatement ps=con.prepareStatement("update register set phone=? where id=?");
                ps.setString(1,phone);
                ps.setInt(2,id);
                val=ps.executeUpdate();
            }

            if(val>0){
                System.out.println("updated successfully");
            }else{
                System.out.println("can not updated");
            }


        }catch (Exception e){

            System.out.println(e);

        }
    }
}
