import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks123 {
    public static void main(String[] args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Task  1
        double perimeter;
        double area;
        System.out.println("Please, enter radius");

        int radius = Integer.parseInt(br.readLine());
        perimeter =  Math.PI * (radius * 2 );

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter:" +  perimeter);

        System.out.println("Area:" +  area);
//        Task 1 ends here

//        Task2

        String name;
        String adress;


        System.out.println("What is your name?");
        name  = br.readLine();
        System.out.println("Where do you live?" + " " + name);
        adress  = br.readLine();
        System.out.println("You live in" + " " + adress + "  " + "and your name is" + " " + name);
//        Task2 ends here
//        Task3
        int c1, c2, c3 , t1 , t2, t3 ;
        c1 = 2;
        c2 = 4 ;
        c3 =  3;
        System.out.println("Please, enter how log calls last");
        t1 = Integer.parseInt(br.readLine());
        t2 = Integer.parseInt(br.readLine());
        t3 = Integer.parseInt(br.readLine());
        System.out.println("c1 * t1 = "+ " " + c1* t1);

        System.out.println("c2 * t2 = "+ " "+ c2* t2);

        System.out.println("c3 * t3 =  "+  "  "+ c3* t3);
        System.out.println("All" + " "+ c1* t1 + c2* t2 + c3* t3);
//Task3  Ends here
        }
    }
