import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        System.out.println("get all registered people");

        getAllInfo getAllInfo1=new getAllInfo();
        getAllInfo1.getALLInfo();

        System.out.println("---------------------------------------");

        System.out.println("register people");

        registerPeople registerPeople=new registerPeople();
        registerPeople.registerPeople();


        System.out.println("---------------------------------------");

        System.out.println("delete person");
        deletePeople deletePeople=new deletePeople();
        deletePeople.deletePeople();

        System.out.println("---------------------------------------");

        getAllInfo1.getALLInfo();

        System.out.println("---------------------------------------");

        updatePeople up=new updatePeople();
        up.updatePeople();
        System.out.println("---------------------------------------");

        getAllInfo1.getALLInfo();

        System.out.println("---------------------------------------");






    }
}